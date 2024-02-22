package TechnoStudy.Unit02.objects.day07;

public class Car {

    private String color;
    private double mileage;

    public Car(String color, double mileage) {
        this.color = color;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public void drive(){

        mileage += 15;
        System.out.println("Vroom vroom. The updated mileage is " + mileage);

    }

    public void drive(int drivenMiles){

        mileage += drivenMiles;
        System.out.println("The updated mileage is " + mileage);

    }

}
