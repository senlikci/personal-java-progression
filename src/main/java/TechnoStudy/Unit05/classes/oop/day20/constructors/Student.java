package TechnoStudy.Unit05.classes.oop.day20.constructors;

public class Student {

    private String id;
    private String fullName;
    private int age;
    private double gpa;
    private boolean isGraduated;


    public static void main(String[] args) {
        Student student1 = new Student();

        //objects are assigned to null

        System.out.println(student1.id);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isGraduated);
    }

}


