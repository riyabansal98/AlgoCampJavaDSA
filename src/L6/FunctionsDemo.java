package L6;



public class FunctionsDemo {

    public static void main(String[] args) {

        System.out.println("Let's get started");
        //Calling a function
        greetingCustomers();
        System.out.println("See you sooon! ");

        int res = addNumbers(30, 10);
        System.out.println(res);
        int res2 = addNumbers();
        System.out.println(res2);

        for(int i = 1; i <= 5; i++) {

            int result = getSquare(i);
            System.out.println("Square of " +  i + " is: " + result) ;
        }


        System.out.println("----------CASE1--------------");
        int one = 10;
        int two = 20;

        int sum = scopes(one, two);
        System.out.println(sum);

        System.out.println("----------CASE2--------------");
        System.out.println(one + ", " + two);
        swap(one, two);
        System.out.println(one + ", " + two);

    }

    public static void swap(int one, int two) {
        System.out.println(one + ", " + two);
        int temp = one;
        one = two;
        two  = temp;
        System.out.println(one + ", " + two);
    }
    public static int scopes(int one, int another) {
        int sum = one  + another;
        return sum;
    }

    public static int getSquare(int x) {
        return x * x;
    }

    public static int addNumbers(int val1, int val2) {

        int sum = val1 + val2;
        return sum;
    }

    public static int addNumbers() {

        int a = 5;
        int b = 10;

        int sum = a + b;
        return sum;
    }

    //Declaring a function
    public static void greetingCustomers() {

        System.out.println("Hello To You!");
        System.out.println("Hope you're having a good Day!");

    }



}
