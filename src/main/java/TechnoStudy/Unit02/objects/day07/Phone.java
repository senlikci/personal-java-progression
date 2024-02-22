package TechnoStudy.Unit02.objects.day07;

public class Phone {

    private String type;
    private String model;
    private String color;
    private double price;

    public Phone(String type, String model, String color, double price) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public  void printPhoneInfo(){
        System.out.println("The phone is " + type + " " + model + " with a color of " + color + " and a price of " + price );
    }
}
