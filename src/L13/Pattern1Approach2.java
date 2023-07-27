public class Pattern1Approach2 {
    public static void g(int n) { // prints n starts in a line
        if(n <= 0) return;
        System.out.print("*");
        g(n-1);
    }
    public static void f(int n, int totalStars) {
        if(n <= 0) return;

        g(totalStars); // call this function to print pattern for the given row
        // at this point we have n starts printed in a line
        // let's go to a new line
        System.out.println();
        f(n-1, totalStars);
    }

    public static void main(String[] args) {
        f(5, 5);
    }
}
