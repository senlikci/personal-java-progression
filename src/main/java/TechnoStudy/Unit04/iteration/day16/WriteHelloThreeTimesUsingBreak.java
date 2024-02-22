package TechnoStudy.Unit04.iteration.day16;

public class WriteHelloThreeTimesUsingBreak {
    public static void main(String[] args) {

        int controlNumber = 1;

        while (true) {
            if (controlNumber > 3) {
                break;
            }
            System.out.println("HELLO");
            controlNumber++;
        }
    }
}