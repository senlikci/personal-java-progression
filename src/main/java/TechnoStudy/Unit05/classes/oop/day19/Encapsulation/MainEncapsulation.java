package TechnoStudy.Unit05.classes.oop.day19.Encapsulation;

public class MainEncapsulation {

    public static void main(String[] args) {
        EncapsulationExample a = new EncapsulationExample();
        System.out.println(a.defaultNum);
        System.out.println(a.publicNum);

        a.publicNum = 10;
        a.protectedNum = 11;
        a.defaultNum = 7;

    }


}
