package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class MainForSetters {
    public static void main(String[] args) {

        Car car1  = new Car("White", 200,2022);
        Car car2 = new Car ("purple", 150000, 1995);

        System.out.println(car1);
        car1.setColor("Blue");
        System.out.println(car1);

        System.out.println(car2);
        car2.setColor("Black");
        car2.setMileage(180000);

        System.out.println(car2);





    }

}
