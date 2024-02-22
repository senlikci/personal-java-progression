package TechnoStudy.Unit04.iteration.day18;

public class NestedLoops {

    public static void main(String[] args) {

        for (int outer = 0; outer < 3; outer++) {

            for (int inner = 0; inner < 3; inner++) {

                System.out.print("outer:\t" + outer + "\tinner:\t" + inner + "\t| ");

            }
            System.out.println();
        }
        
    }
}
