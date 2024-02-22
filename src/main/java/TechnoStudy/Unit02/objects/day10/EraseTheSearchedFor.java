package TechnoStudy.Unit02.objects.day10;

public class EraseTheSearchedFor {

    public static void main(String[] args) {

        String str1 = "SDET is the best";


        //remove the searchWord from the string and print it again.
        //best -> SDET is the
        //the => SDET is best



        String searchWord = "the";

        int beginningIndex = str1.indexOf(searchWord);
        System.out.println(beginningIndex);

        String firstWord = str1.substring(0,str1.indexOf(searchWord));
        System.out.println(firstWord);

        String secondWord = str1.substring(str1.indexOf(searchWord) + searchWord.length());

        System.out.println(secondWord);

        System.out.println(firstWord + secondWord);

    }
}
