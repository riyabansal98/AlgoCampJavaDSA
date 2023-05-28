package L2;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
//        System.out.println("Hello");
//
//        int val = 10;
//
//        System.out.println(val);
//        System.out.println(5);
//
//        System.out.println("I am " + "awesome at programming");
//        System.out.println("Number = " + val);  //Number = 10
//
//        //create an object of Scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer value : ");
        //take input from user
        int number = input.nextInt();

        System.out.println("You entered " + number);

//        float myFloat = input.nextFloat();
//
//        double myDouble = input.nextDouble();
//
//        String myString = input.next();

        // next() -> read a word from the user
        //nextLine() -> read a line of text from user.

    }

}
