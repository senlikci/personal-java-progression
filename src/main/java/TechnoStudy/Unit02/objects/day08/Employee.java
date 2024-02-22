package TechnoStudy.Unit02.objects.day08;

public class Employee {

    private String name;
    private double salary;

    public Employee(String employeeName, double employeeSalary) {
        name = employeeName;
        salary = employeeSalary;
    }

    public void increase(double amountOfIncrease) {

        salary += amountOfIncrease;

    }

    public double getSalary() {

        return salary;
    }

}
