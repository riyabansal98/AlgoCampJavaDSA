package L5;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 3;
        //print till nth fibonnaci numbers
        //print first n fibonnaci numbers
        //print the nth fibonnaci number

        int a  = 0;
        int b = 1;

        int count = 1;

        while(count <= n + 1) {

            System.out.println(a);

            int sum = a + b;
            a = b;
            b = sum;

            count = count + 1;
        }
    }
}
