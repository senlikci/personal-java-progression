package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class EmployeeMainClass {

    public static void main(String[] args) {

        Employee employee = new Employee("employee1",120000, "Michael Jackson");

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

        System.out.println("------------------------------------------------------------------------");

        employee.setName("Henry");
        employee.setEmployeeId("employee2");
        employee.setSalary(140000);

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
