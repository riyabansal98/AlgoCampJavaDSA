package L17;

public class BicycleClient {

    public static void main(String[] args) {

        //create object
        Bicycle sportsBicycle = new Bicycle();

        System.out.println(sportsBicycle.gear);
        sportsBicycle.braking();
        sportsBicycle.gear = 20;

        System.out.println(sportsBicycle.gear);
        //create object
        Bicycle touringBicycle = new Bicycle();

        System.out.println(touringBicycle.gear);
        touringBicycle.braking();
    }
}
