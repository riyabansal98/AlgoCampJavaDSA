package L17;

public class Lamp {

    boolean isOn;


    void turnOn() {
        isOn = true;
        System.out.println("Light is turned on");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light is turned off");
    }

//    public static void main(String[] args) {
//
//        Lamp led = new Lamp();
//        Lamp halogen = new Lamp();
//
//        led.turnOn();
//
//        halogen.turnOff();
//    }

}

