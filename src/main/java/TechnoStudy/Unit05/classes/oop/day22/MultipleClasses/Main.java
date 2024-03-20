package TechnoStudy.Unit05.classes.oop.day22.MultipleClasses;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("123 Main Ave", "Brooklyn", "NY", "11944");
        Address address2 = new Address("123 Main Ave", "Los Angeles", "CA", "11944");
        Student student1 = new Student("John", 4.0, address1);

        System.out.println(student1.getAddress());

        System.out.println(student1.isSameState(address2));
    }
}
