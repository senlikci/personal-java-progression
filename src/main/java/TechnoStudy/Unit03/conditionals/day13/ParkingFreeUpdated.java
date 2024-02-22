package TechnoStudy.Unit03.conditionals.day13;

public class ParkingFreeUpdated {

    public static void main(String[] args) {

        double hours = 8;
        double total = 0.0;

        if (hours <= 2) {
            total = 30;
        } else if (hours <= 4) {
            total = hours * 13;
        } else {
            total = hours * 12;
        }
        System.out.println("Your total is " + total );
    }


}
