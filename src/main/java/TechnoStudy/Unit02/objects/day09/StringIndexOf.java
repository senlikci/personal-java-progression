package TechnoStudy.Unit02.objects.day09;

public class StringIndexOf {
    public static void main(String[] args) {

        String str1 = "SDET is the best";

        //use substring to get "is"
        System.out.println(str1.substring(5, 7));

        //use substring to get "SDET"
        System.out.println(str1.substring(0, 4));

        //print the given word from the string using string methods
        String searchWord = "the";

        int index = str1.indexOf(searchWord);
        System.out.println(index);

        System.out.println(str1.substring(index,index + searchWord.length()));



    }
}
