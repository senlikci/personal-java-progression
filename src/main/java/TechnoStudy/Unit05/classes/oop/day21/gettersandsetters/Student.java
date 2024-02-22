package TechnoStudy.Unit05.classes.oop.day21.gettersandsetters;

public class Student {

    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public  String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

}
