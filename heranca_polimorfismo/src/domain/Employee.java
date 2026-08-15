package domain;

public sealed abstract class Employee permits Manager, Salesman {
    /*
    Uma classe abstract não pode ter instancia
    Mas podemos ter variaveis do tipo dela.
     */

    /*
    Sealed é um pouco diferente de final, ela exige permissões
     */

    public Employee(String code,
                    String name,
                    String address,
                    int age,
                    double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Employee() { }


    protected String code;

    protected String name;


    protected String address;

    protected int age;

    protected double salary;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }


}
