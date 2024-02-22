package TechnoStudy.Unit04.iteration.day18;

public class StringTraversing {

    public static void main(String[] args) {
        String str1 = "world cup";



        for (int i = str1.length(); i > 0 ; i--) {

            System.out.println(str1.substring(i-1,i));  //Reverse

        }

    }
}
