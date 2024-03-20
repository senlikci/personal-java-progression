package TechnoStudy.Unit05.classes.oop.day22;

public class Rectangle {

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public boolean isSquare(){
        return width == height;
    }

    public void printInfo(){
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("square: " + isSquare());
        System.out.println("area: " + getArea());
    }
}
