package TechnoStudy.Unit04.iteration.day16;

public class AddEvenNumbers1To10 {

    public static void main(String[] args) {

        int number = 1;
        int total = 0;

        while(number<=10){
            if (number%2 == 0){
                total = total + number;
            }
            number++;
        }

        System.out.println("The total is " + total);

    }
}
