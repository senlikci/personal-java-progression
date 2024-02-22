package TechnoStudy.Unit03.conditionals.day14;

public class DrivingNestedIf {
    public static void main(String[] args) {

        boolean hasDriverLicense = true;
        boolean clearBackground = false;

        if (hasDriverLicense && clearBackground){
            System.out.println("You can drive for the company");
        }else {
            System.out.println("You cannot drive.");
        }


        if (hasDriverLicense){

            if (clearBackground){
                System.out.println("You can drive");
            }else {
                System.out.println("You don't have a clear background check.");
            }

        }else {
            System.out.println("You need a driver licence.");
        }
    }
}
