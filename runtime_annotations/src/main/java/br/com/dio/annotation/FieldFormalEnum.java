package br.com.dio.annotation;

import java.util.function.Function;

import static com.google.common.base.CaseFormat.*;

public enum FieldFormalEnum {
    CAMEL_CASE(field -> field ),
    PASCAL_CASE(field -> LOWER_CAMEL.to(UPPER_CAMEL, field)),
    SNAKE_CASE(field -> LOWER_CAMEL.to(LOWER_UNDERSCORE, field)),
    KEBAB_CASE(field -> LOWER_CAMEL.to(LOWER_HYPHEN, field)),;


    private final Function<String, String> format;

    FieldFormalEnum(final Function<String, String> format) {
        this.format = format;
    }

    public Function<String, String> getFormat() {
        return format;
    }
}
