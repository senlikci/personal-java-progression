package TechnoStudy.Unit04.iteration.day16;

import java.util.Scanner;

public class LuckyNumber {

    public static void main(String[] args) {

        int luckyNumber = 69;
        int  userGuess;

        do {
            System.out.println("What is the lucky number?");

            Scanner scan = new Scanner(System.in);
            userGuess = scan.nextInt();
        }while (userGuess!=luckyNumber);

        System.out.println("You guessed the lucky number");
    }
}
