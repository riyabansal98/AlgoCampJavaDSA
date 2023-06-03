package L4;

public class IterativeStatementsDemo {

    public static void main(String[] args) {

        //Task is to print  numbers from 1 - 10.

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);

//        int n  = 10;
//
//        for(int i = 1; i <= n; i++) {
//            System.out.println("Hello " + i);
//        }

        int n1 = 10;
        int i1 = 1;

        while(i1 <= n1) {
            System.out.println("Hello " + i1);
            i1++;
        }

        int n2 = 10;
        int i2 = 1;

        do {
            System.out.println("Hello " + i2);
            i2++;

        }while(i2 <= n2);

        //printing numbers from 15 to 25

        int max = 25;
        for(int i = 15; i <= max; i++) {
            System.out.println("Hello " + i);
        }


//        for(int m = 10; m <= 9; m++){
//            System.out.println("Hello");
//        }

        int m = 10;
        do {
            System.out.println("Hello");
            m++;
        }while(m <= 9);



    }
}
