package TechnoStudy.Unit03.conditionals.day13;

public class SwitchExample {

    public static void main(String[] args) {
        int selection = 6;

        switch (selection) {
            case 1:
                System.out.println("You selected number one.");
                break;
            case 2:
                System.out.println("You selected 2");
                break;
            case 3:
                System.out.println("You selected 3");
                break;
            case 4:
                System.out.println("You selected 4");
                break;
            default:
                System.out.println("You selected none.");
                break;
        }

    }
}
