package Entities;

public class Person {
    private String name;
    private int mobile;
    private String email;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
