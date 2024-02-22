package TechnoStudy.Unit05.classes.oop.day20.constructors;

public class Employee {

    private String id;
    private double salary;
    private  boolean isManager;
    private String name;

    public Employee(){
        id="1234567";
        salary=120.512;
        isManager = false;
        name = "John Doe";

    }

    public Employee(String id, double salary, boolean isManager, String name) {
        this.id = id;
        this.salary = salary;
        this.isManager = isManager;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", isManager=" + isManager +
                ", name='" + name + '\'' +
                '}';
    }
}
