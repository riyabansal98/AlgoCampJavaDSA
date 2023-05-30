package L3;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a >= b && a >= c) {
            System.out.println(a);
        }else if(b >= a && b >= c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
