package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class HouseMain {

    public static void main(String[] args) {

        House house1 = new House("Blue", "Main Ave", 300000);
        House house2 = new House("Yellow", "Florida", 400000);

        System.out.println(house1);
        System.out.println(house2);

        System.out.println(house2.getPrice());

        house1.setAddress("5th Ave");
        System.out.println(house1);  //address of house1 is changed
    }
}
