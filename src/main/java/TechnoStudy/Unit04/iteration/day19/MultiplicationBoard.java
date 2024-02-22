package TechnoStudy.Unit04.iteration.day19;

public class MultiplicationBoard {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j*i + " ");
            }
            System.out.println();
        }
    }
}
