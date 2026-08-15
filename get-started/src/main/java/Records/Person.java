package main.java.Records;

public record Person(String name) {
    public String nameInUpperCase() {
        return name.toUpperCase();
    }


}
