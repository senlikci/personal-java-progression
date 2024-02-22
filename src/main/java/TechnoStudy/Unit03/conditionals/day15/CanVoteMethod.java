package TechnoStudy.Unit03.conditionals.day15;

public class CanVoteMethod {


    public static void main(String[] args) {

        int voterAge = 18;
        boolean isRegistered = false;

        boolean readyToVote = canVote(voterAge,isRegistered);

        System.out.println("Can vote: " + readyToVote);

    }

    public static boolean canVote(int age, boolean isRegistered){

        if(age>=18 && isRegistered){
            return true;
        }else {
            return false;
        }

    }
}
