package TechnoStudy.Unit02.objects.day08;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){

        int area;
        area = width*height;
        return area;
    }


}
