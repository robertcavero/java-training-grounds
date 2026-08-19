package br.com.dio.processor;

import br.com.dio.annotation.SerializerMethod;
import br.com.dio.annotation.SerializerType;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SerializerProcessor {
    public String serializer(final Object object) throws IllegalAccessException, InvocationTargetException {
        Objects.requireNonNull(object, "Enter with non null object");

        var clazz = object.getClass();

        var typeAnnotation = Stream.of(clazz.getAnnotations())
                .flatMap(a -> a instanceof SerializerType s
                        ? Stream.of(s)
                        : Stream.empty())
                /*.filter(SerializerType.class::isInstance)
                .map(SerializerType.class::cast)*/
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("for serializer object annotate it with @SerializerType"));

        var fielNamedFormatter = typeAnnotation.fieldFormat().getFormat();

        var  prettify = typeAnnotation.prettify();

        Map<String, Object> elements = new HashMap<>();
        for (var field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            elements.put(field.getName(),field.get(object));
        }


        var annotationMethods = Stream.of(object.getClass().getMethods())
                .filter(m -> Stream.of(m.getAnnotations()).anyMatch(a -> a.annotationType().equals(SerializerMethod.class)))
                .toList();


        for(var method : annotationMethods) {
            method.setAccessible(true);
            var customName = method.getAnnotation(SerializerMethod.class).value(); //check SerializerMethod

            elements.put(customName.isBlank() ? method.getName() : customName, method.invoke(object));
        }


        var jsonFields = elements.entrySet().stream()
                .map(e -> String.format(
                        "    \"%s\":%s",
                        fielNamedFormatter.apply(e.getKey()),
                        e.getValue()

                ))
                .collect(Collectors.joining(String.format(",%s", System.lineSeparator())));


        var json = String.format(
                "{%s%s%s}",
                System.lineSeparator(),
                jsonFields,
                System.lineSeparator()
        );

        return prettify ? json : json.replaceAll(System.lineSeparator(), "")
                .replaceAll(" {4}", "");







    }


    private String formatValue(final Object value) {
        return value instanceof String s ?
                String.format("\"%s\"", s) :
                value.toString();
    }

}
