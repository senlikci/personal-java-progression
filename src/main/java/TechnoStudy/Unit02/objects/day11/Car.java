package TechnoStudy.Unit02.objects.day11;

public class Car {

    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public Car(String color) {
        this.color = color;


    }
}
