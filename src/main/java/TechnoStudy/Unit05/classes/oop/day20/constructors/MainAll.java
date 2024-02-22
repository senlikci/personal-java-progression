package TechnoStudy.Unit05.classes.oop.day20.constructors;

public class MainAll {

    public static void main(String[] args) {

        Car myCar = new Car();
        Car herCar = new Car("Orange", 2015,56234.44,true);

        House staffHouse = new House();
        House myHouse = new House("Black", "Greenport", 1234563.4,false);

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("employee111",90323.12,false,"Sercan");



        System.out.println(myCar);
        System.out.println(herCar);

        System.out.println(staffHouse);
        System.out.println(myHouse);

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
