package TechnoStudy.Unit04.iteration.day16;

public class InvestmentCalculator {


    public static void main(String[] args) {

        calculateYears(100,0.30,10000);

    }

    public static int calculateYears(double balance, double rate, double targetBalance){

        int year=0;

        while(balance<=10000){
            balance = balance + (balance*0.30);
            year++;

            System.out.println("Year " + year + " : " + balance);
        }

        System.out.println("It took " + year + " years.");
        return year;
    }

}
