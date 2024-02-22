package TechnoStudy.Unit02.objects.day08;

public class Practice1 {

    private double num;

    public Practice1(double num) {
        this.num = num;
    }

    public double doubleValue(){

        double result = num*2;
        return result;
    }
    public double halfValue(){
        return num/2;
    }

    public double tripleValue(){
        return num*3;
    }


}
