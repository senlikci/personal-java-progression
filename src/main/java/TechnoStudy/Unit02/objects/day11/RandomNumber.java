package TechnoStudy.Unit02.objects.day11;

public class RandomNumber {

    public static void main(String[] args) {




        for (int i = 0; i < 50; i++) {
            int randomNumber = (int)(Math.random()*10) + 1;
            System.out.println(randomNumber);
        }


    }

}
