package TechnoStudy.Unit05.classes.oop.day20.constructors;

public class HouseMain {

    public static void main(String[] args) {

        House ourHouse = new House();
        House momsHouse = new House("White", "Denizli, Turkiye", 250234.22, true);

        System.out.println(ourHouse);
        System.out.println(momsHouse);


    }
}
