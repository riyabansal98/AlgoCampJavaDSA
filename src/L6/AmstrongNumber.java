package L6;

public class AmstrongNumber {

    //A positive integer is called an amstrong number if
    //abc  = a^n + b ^n + c^n

    //153 -> 1^3 + 5^3 + 3^3
    //1634 -> 1^4 + 6^4 + 3^4 + 4^4

    //Given an input number, true/false, if it is an amstrong number of not.
    //153 -> true
    //570 -> false
    //1634 -> true

    public static void main(String[] args) {
        //System.out.println(isArmstrong(153));
        printAmstrongNumbers(100, 500);

    }


    public static void printAmstrongNumbers(int lo, int high) {

        for(int n = lo; n <= high; n++) {

            boolean res = isArmstrong(n);
            if(res) {
                System.out.println(n);
            }
        }
    }
    public static boolean isArmstrong(int n) {
        //n = 0
        int nod = countDigits(n);  // 4
        int on = n;  // 1634
        int sum = 0; //4 ^ 4 + 3 ^ 4 + 6 ^ 4 + 1 ^ 4
        while(n > 0) {

            int rem = n % 10; //1
            sum += Math.pow(rem, nod); // 1 ^ 4
            n = n / 10;
        }
//        if(sum == on) {
//            return true;
//        }else{
//            return false;
//        }
        return sum == on;
    }
    public static int countDigits(int n) {

        int nod = 0;

        while(n > 0) {
            n = n / 10;
            nod++;
        }

        return nod;
    }
}


