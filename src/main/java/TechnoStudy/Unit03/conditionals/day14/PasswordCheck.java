package TechnoStudy.Unit03.conditionals.day14;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

        String password;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password:");
        password = scan.nextLine();



//        if (password.length()>=6 && password.contains("!")){
//            System.out.println("Valid password");
//        }else {
//            System.out.println("Invalid password");
//        }

        if (password.length()>=6){
            if (password.contains("!")){
                System.out.println("Valid password");
            }else {
                System.out.println("Password does not contain \"!\"");
            }
        }else {
            System.out.println("Password is shorter than 6 characters!");
        }

    }

}
