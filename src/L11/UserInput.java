package L11;


import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        //Java provides different ways to get input from the user.
        //Scanner

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter an integer: ");
//        int num = input.nextInt();
//        System.out.println("You entered : " + num);


        System.out.println("Enter Text: ");
        String  myString = input.next();
        System.out.println("You entered : " + myString);

        input.close();


    }
}
