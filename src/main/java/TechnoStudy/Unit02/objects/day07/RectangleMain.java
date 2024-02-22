package TechnoStudy.Unit02.objects.day07;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(15,25);
        Rectangle rectangle1 = new Rectangle(13,8);


        int area1 = rectangle.getArea();
        int area2 = rectangle1.getArea();
        System.out.println("The total area of the rectangles is " + (area1+area2));


    }

}
