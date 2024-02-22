package TechnoStudy.Unit02.objects.day07;

public class Rectangle {

    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public void printArea() {

        int area = width*height;

        System.out.println("The area of the rectangle is " + area);

    }

    public int getArea(){
        int area = width*height;
        return area;
    }

}
