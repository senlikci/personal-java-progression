package TechnoStudy.Unit02.objects.day07;

public class CarMain {


    public static void main(String[] args) {

        Car car1 = new Car("blue", 0);
        System.out.println(car1);

        car1.drive();
        car1.drive(500);
    }
}
