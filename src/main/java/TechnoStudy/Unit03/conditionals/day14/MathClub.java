package TechnoStudy.Unit03.conditionals.day14;

public class MathClub {

    public static void main(String[] args) {

        double gpa = 2.9;
        String grade = "A";

        if (gpa>=3.0 || grade.equals("A")){
            System.out.println("You can join math club");
        }else {
            System.out.println("Can't join math club.");
        }


    }
}
