package TechnoStudy.Unit03.conditionals.day13;

public class IfExample {

    public static void main(String[] args) {

        double drinkPrice = 3;
        int quantity = 7;

        if (quantity>=5){
            drinkPrice = 2.5;
        }
        System.out.println(drinkPrice*quantity);

    }
}
