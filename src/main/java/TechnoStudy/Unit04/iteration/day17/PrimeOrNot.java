package TechnoStudy.Unit04.iteration.day17;

public class PrimeOrNot {

    public static boolean isPrime(int number) {

        for (int i = 2; i * i < number; i++) {

            if (number%i==0){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }

}
