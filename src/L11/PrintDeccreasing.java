public class PrintDeccreasing {
    public static void f(int n) {
        // base case 
        if(n == 0) {
            return; // do nothing as 0 is not a natural number
        }
        System.out.println(n);
        f(n-1);
    }
    public static void main(String[] args) {
        f(50);
    }
}
