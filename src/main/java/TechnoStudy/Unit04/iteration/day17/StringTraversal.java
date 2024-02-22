package TechnoStudy.Unit04.iteration.day17;

public class StringTraversal {

    public static void main(String[] args) {

        String str1 = "Hello";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.substring(i,i+1));
        }

    }

}
