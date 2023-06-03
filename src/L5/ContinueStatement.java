package L5;

public class ContinueStatement {

    public static void main(String[] args) {


//        for(int i = 1; i <= 10; i++) {
//
//            if( i > 4 && i < 9) {
//                continue;
//            }
//
//            System.out.println(i);
//        }

        int i = 1, j = 1;

        while(i <= 3) {

            System.out.println("Outer loop: " + i);

            while(j <= 3) {
                if(j == 2) {
                    j++;
                    continue;
                }

                System.out.println("Inner loop: " + j);
                j++;
            }
            i++;
        }
    }
}
