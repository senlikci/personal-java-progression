package TechnoStudy.Unit03.conditionals.day15;

public class SaleAndShipment {

    public static int getTotal(int quantity){
        int itemPrice = 20;
        int shipment = 7;

        if(quantity>10){
            itemPrice -= 2;
        }
        if (quantity>15){
            shipment = 0;
        }

        return (itemPrice*quantity) + shipment;

    }

    public static void main(String[] args) {


        System.out.println(getTotal(20));

    }
}
