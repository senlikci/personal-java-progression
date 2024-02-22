package TechnoStudy.Unit02.objects.day08;

public class Flashlight {

    private boolean isOn;

    public Flashlight() {
        this.isOn = false;
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Flashlight is off");
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Flashlight is on");
    }
}
