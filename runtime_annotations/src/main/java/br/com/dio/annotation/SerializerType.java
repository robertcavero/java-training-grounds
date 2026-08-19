package br.com.dio.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static br.com.dio.annotation.FieldFormalEnum.CAMEL_CASE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Retention(RUNTIME)
@Target(TYPE)
public @interface SerializerType {
    FieldFormalEnum fieldFormat() default CAMEL_CASE;

    boolean prettify() default true;
}
