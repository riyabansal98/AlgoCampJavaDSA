package L3;

import java.util.Scanner;

public class ValidTriangle {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int sum = a + b + c;

        if(sum == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Valid Triangle");
        }else{
            System.out.println("InValid Triangle");
        }
    }
}
