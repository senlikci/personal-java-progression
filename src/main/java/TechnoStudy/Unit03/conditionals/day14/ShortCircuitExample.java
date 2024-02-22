package TechnoStudy.Unit03.conditionals.day14;

public class ShortCircuitExample {

    public static void main(String[] args) {

        int numOfSlices = 10;
        int numOfPeople = 0;

        if (numOfSlices/numOfPeople >= 2.0){
            System.out.println("You have enough pizza");
        }else {
            System.out.println("Not enough pizza for everyone");
        }

    }
}
