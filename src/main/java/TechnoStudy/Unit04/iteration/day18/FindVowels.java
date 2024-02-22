package TechnoStudy.Unit04.iteration.day18;

public class FindVowels {


    public static void main(String[] args) {

        String word = "kara ambar kamyoncular dernegi";
        String vowels = "aeiou";

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.substring(i,i+1))){
                counter++;
            }
        }
        System.out.println("Total number of vowels: " + counter);
    }

}
