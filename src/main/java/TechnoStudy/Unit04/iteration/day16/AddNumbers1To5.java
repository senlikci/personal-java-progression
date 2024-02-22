package TechnoStudy.Unit04.iteration.day16;

public class AddNumbers1To5 {

    public static void main(String[] args) {

        int number=1;
        int total = 0;

        while (number<6){

            total = total + number;
            number++;
        }
        System.out.println(total);

    }
}
