package TechnoStudy.Unit03.conditionals.day12;

import java.util.Scanner;

public class StepsGoal {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("How many steps did you have?");

        int steps = scan.nextInt();

        boolean reachedGoal = steps >= 7500;

        System.out.println("Goal reached: " + reachedGoal);




    }
}
