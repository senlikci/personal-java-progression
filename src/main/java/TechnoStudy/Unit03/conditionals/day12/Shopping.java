package TechnoStudy.Unit03.conditionals.day12;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        int itemsCount;
        int price = 25;
        int totalPrice = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many items do you want to buy?");
        itemsCount = scan.nextInt();

        if (itemsCount>=5){
            totalPrice = itemsCount * (price - 1);

        }

        if (itemsCount<5){
            totalPrice = itemsCount * price;
        }

        System.out.println("Total price is " + totalPrice + " dollars.");

    }
}
