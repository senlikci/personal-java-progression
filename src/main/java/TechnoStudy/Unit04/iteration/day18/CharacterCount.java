package TechnoStudy.Unit04.iteration.day18;

public class CharacterCount {

    public static void main(String[] args) {

        String str1 = "argentina";
        String str2 = "banana";

        int counter = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str2.substring(i, i + 1).equals("a")) {
                counter++;
            }
        }

        System.out.println(counter);

        String str3 = "hababam gum gum hababam gum gum";

        //find the number of ba's.


        System.out.println("Looking for ab's");

        int counter3 = 0;

        for (int i = 0; i < str3.length() - 1; i++) {

            if (str3.substring(i, i + 2).equals("ab")) {
                counter3++;
            }
        }
        System.out.println(counter3);
    }


}
