package TechnoStudy.Unit03.conditionals.day14;

public class NetflixSubscription {


    public static void main(String[] args) {

        boolean hasSubscription = false;
        boolean inFreeTrial = true;

        if (hasSubscription || inFreeTrial){
            System.out.println("You can watch the movies");
        }else {
            System.out.println("Please subscribe or try for free");
        }

    }



}
