package L3;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int inp = scn.nextInt();

        if(inp % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
