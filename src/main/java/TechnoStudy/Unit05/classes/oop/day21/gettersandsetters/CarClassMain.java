package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class CarClassMain {

    public static void main(String[] args) {

        Car car1 = new Car("Gray", 128215,2002);
        Car car2 = new Car("Orange", 54043,2015);
        System.out.println("Car 1 mileage is " + car1.getMileage());
        System.out.println("Car 2 mileage is " + car2.getMileage());
    }


}
