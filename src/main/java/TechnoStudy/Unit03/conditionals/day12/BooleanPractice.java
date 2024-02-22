package TechnoStudy.Unit03.conditionals.day12;

import java.util.Scanner;

public class BooleanPractice {

    public static void main(String[] args) {

        int age;

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");

        age = scan.nextInt();

        boolean canJoin = age>=18;

        System.out.println(canJoin);



    }


}
