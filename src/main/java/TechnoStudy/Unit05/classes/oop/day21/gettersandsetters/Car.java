package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class Car {

    private String color;
    private double mileage;
    private int year;

    public Car(String color, double mileage, int year) {
        this.color = color;
        this.mileage = mileage;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "It is a " + color + " car with mileage of " + mileage + " made in " + year;
    }
}
