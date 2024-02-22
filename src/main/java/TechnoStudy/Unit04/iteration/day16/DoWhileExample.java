package TechnoStudy.Unit04.iteration.day16;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {
        String secretCode = "Secret";
        String secretInput;
        do{
            System.out.println("Enter the secret code:");
            Scanner scan = new Scanner(System.in);
            secretInput =scan.nextLine();
        }while (!secretCode.equals(secretInput));

        System.out.println("Congrats, you found the secret code.");

    }
}
