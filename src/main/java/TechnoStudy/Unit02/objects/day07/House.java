package TechnoStudy.Unit02.objects.day07;

public class House {

    private String color, address;

    public House(String color, String address) {
        this.color = color;
        this.address = address;
    }

    public void changeColor(String newColor){

        color = newColor;
        System.out.println("Your house is painted to " + color);

    }

}
