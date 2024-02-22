package TechnoStudy.Unit03.conditionals.day14;
import java.util.Random;

public class DiceGame {

    public static boolean rollDice(int dice1,int dice2){

//        dice1 = ((int) Math.random() * 10);
//        dice2 = ((int) Math.random() * 10);

        Random dice = new Random();

        dice1 = dice.nextInt();
        dice2 = dice.nextInt();

        System.out.println("You rolled " + dice1 + " and " + dice2 + ".");

        if (dice1 == dice2 || (dice1 + dice2) >= 8){
            System.out.println("You win!");
        }else {
            System.out.println("You lost!");
        }
return true;
    }

    public static void main(String[] args) {



    }
}
