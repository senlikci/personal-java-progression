package TechnoStudy.Unit04.iteration.day17;

public class PrintOddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i % 2 == 1 && i <= 10; i = i + 2) {

            System.out.println(i);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        for (int i = 15; i > 10 ; i--) {
            System.out.println("Hello World");
        }

        for (int i = 5; i < 30 ; i = i + 5) {
            System.out.println("Hello World");
        }
    }
}
