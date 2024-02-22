package TechnoStudy.Unit03.conditionals.day15;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(3,5);
        Rectangle rect2 = new Rectangle(3,5);


        if (rect1.equals(rect2)){
            System.out.println("They have same values");
        }else {
            System.out.println("They don't have same values.");
        }
    }
}
