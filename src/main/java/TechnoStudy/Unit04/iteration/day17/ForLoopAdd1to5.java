package TechnoStudy.Unit04.iteration.day17;

public class ForLoopAdd1to5 {

    public static void main(String[] args) {

        System.out.println(sumOfNumbers(8));
        printHelloJavaNTimes(10);
        printFirstNNumbers(100);
    }

    public static int sumOfNumbers(int number) {

        int total = 0;

        for (int i = 1; i <= number; i++) {

            total = i + total;

        }
        return total;

    }

    public static void printHelloJavaNTimes(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Hello Java");
        }

    }

    public static void printFirstNNumbers(int n) {
        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ");

        }
        System.out.println();
    }
}
