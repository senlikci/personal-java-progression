package TechnoStudy.Unit02.objects.day11;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){

        return Math.pow(this.radius,2)*Math.PI;

    }

    public double getPerimeter(){

        return (this.radius*2)*Math.PI;

    }

}
