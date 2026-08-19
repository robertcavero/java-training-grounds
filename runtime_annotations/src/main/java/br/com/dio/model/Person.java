package br.com.dio.model;

import br.com.dio.annotation.FieldFormalEnum;
import br.com.dio.annotation.SerializerMethod;
import br.com.dio.annotation.SerializerType;


import static br.com.dio.annotation.FieldFormalEnum.KEBAB_CASE;
import static br.com.dio.annotation.FieldFormalEnum.PASCAL_CASE;

/*
Para apontar que essa classe vai ser candidata a ser serializada,
precisamos marcá-la.
 */
@SerializerType(fieldFormat = PASCAL_CASE, prettify = false)
public class Person {

    private long id;

    private String name;

    private int age;

    public Person() {
    }

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @SerializerMethod("firstPersonName")
    public String firstName() {
        return name.split(" ")[0];
    }

}
