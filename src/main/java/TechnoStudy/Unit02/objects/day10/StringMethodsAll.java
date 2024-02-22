package TechnoStudy.Unit02.objects.day10;

public class StringMethodsAll {

    public static void main(String[] args) {

        //substring

        String state = "Denizli";
        System.out.println(state.substring(5));

        System.out.println(state.substring(state.length()-1));

        //equals

        String otherState = "California";
        System.out.println(state.equals(otherState));

        String name1 = "Ankara";
        String name2 = "Denizli";

        System.out.println(name1.equals(name2));

        //charAt

        System.out.println("John".charAt(1));

        String string1 = "Java String";
        String string2 = "Techno Study";



    }
}
