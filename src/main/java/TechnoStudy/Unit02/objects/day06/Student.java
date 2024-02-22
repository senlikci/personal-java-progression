package TechnoStudy.Unit02.objects.day06;

public class Student {

    private String name;
    private double gpa;

    public Student(String theName, double theGpa){

        name = theName;
        gpa = theGpa;
        System.out.println("Message from the Constructor:");
        System.out.print("A student is created the name ");
        System.out.println(name);
        System.out.print("The GPA is: ");
        System.out.println(gpa);


    }

    public static void main(String[] args) {

        System.out.println("Main Started");
        Student student1 = new Student("John",3.5);
        System.out.println("Main finalized");

    }
}
