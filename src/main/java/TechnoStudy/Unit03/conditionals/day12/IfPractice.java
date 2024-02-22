package TechnoStudy.Unit03.conditionals.day12;

import java.util.Scanner;

public class IfPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many steps did you have?");

        int steps = scan.nextInt();

        if (steps>=7500){
            System.out.println("You reached your goal");
        }

        if (steps<7500){
            System.out.println("Keep walking.");
        }
        System.out.println("Healthy life rocks");

    }
}
