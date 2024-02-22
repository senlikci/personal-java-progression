package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class StudentMainClass {

    public static void main(String[] args) {

        Student student1 = new Student("1725886", "Sercan", 2.35);

        //if a constructor is declared, Java won't provide default constructor anymore.

        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.getGpa());

        System.out.println(student1);
        student1.setName("Morgant");
        student1.setId("1083");
        student1.setGpa(3.99);
        System.out.println(student1);

    }
}
