package L3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        //A year is a considered a leap year
        //1. If (year is exactly divisible by 4) and (not divisibly by 100), or
        //2. If year is divisible by 400,
        //then it is a leap year.

        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if(  (  (year % 4 == 0) && (year % 100 != 0)  ) || (year % 400 == 0) ) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
