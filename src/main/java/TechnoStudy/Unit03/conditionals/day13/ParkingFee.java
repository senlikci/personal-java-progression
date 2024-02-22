package TechnoStudy.Unit03.conditionals.day13;

public class ParkingFee {
    public static void main(String[] args) {
        int hour;
        double price;

        hour = 3;
        if (hour <= 2) {
            price = 30;
        } else {
            price = 12;
        }


        System.out.println(price*hour);
    }


}



