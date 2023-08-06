package L11;

public class StackMemoryDemo {

    public static void main(String[] args) {


        System.out.println("Hello there!");

        int defaultVal = 2;
        defaultVal = multiplyTwo(defaultVal);
        defaultVal = multiplyFour(defaultVal);
//        greetings();
//        askQuery();

        System.out.println(defaultVal);
    }

    private static int multiplyFour(int val) {

        val *= 4;

        return val;
    }

    private static int multiplyTwo(int val) {

        val *= 2;
        return val;
    }


    public static void greetings() {

        System.out.println("Hope! You're doing well");
    }

    public static void askQuery() {

        System.out.println("How may I help you today? ");
    }
}
