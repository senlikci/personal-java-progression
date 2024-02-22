package TechnoStudy.Unit05.classes.oop.day20.constructors;

public class Car {

    private String color;
    private int year;
    private double mileage;
    private boolean isAutomatic;

    public Car() {
        color = "Black";
        year = 2022;
        mileage = 0.0;
        isAutomatic = true;

    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", isAutomatic=" + isAutomatic +
                '}';
    }

    public Car(String color, int year, double mileage, boolean isAutomatic) {
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.isAutomatic = isAutomatic;
    }
}
