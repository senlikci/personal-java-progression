package TechnoStudy.Unit02.objects.day08;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Sercan", 100000);
        employee.increase(2500);

        double newSalary = employee.getSalary();
        System.out.println(newSalary);

    }

}
