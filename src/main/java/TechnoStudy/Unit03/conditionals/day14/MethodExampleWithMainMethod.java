package TechnoStudy.Unit03.conditionals.day14;

public class MethodExampleWithMainMethod {

    public static void sayHello() {
        System.out.println("Hello User.");
    }

    public static void sayHelloWithName(String name) {
        System.out.println("Hello " + name);
    }

    public static int sumTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void greetingJava(){
        System.out.println("Hello Java");
    }

    public static void greetingWithName(String name){
        System.out.println("How are you today, " + name + "?");
    }

    public static void canJoinParty(int age){
        if (age>=18){
            System.out.println("Enjoy the party!");
        }else {
            System.out.println("Not allowed!");
        }
    }

    public static void canJoinPartyTernary(int age){

        String message;

        message = age >= 18 ? "Enjoy the ternary party!" : "Not allowed!";
        System.out.println(message);
    }

    public static void main(String[] args) {

        sayHello();
        sayHelloWithName("John");
        System.out.println(sumTwoNumbers(2, 3));
        greetingJava();
        greetingWithName("Sercan");
        canJoinParty(19);
        canJoinPartyTernary(20);
    }

}
