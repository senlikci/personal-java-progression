package TechnoStudy.Unit04.iteration.day17;

public class WhileForCountdown {

    public static void main(String[] args) {

        for (int i = 10; i >=0 ; i--) {

            System.out.println("Countdown " + i);
        }

        int number = 10;

        while(number>=0){
            System.out.println(number);
            number--;
        }
    }

}
