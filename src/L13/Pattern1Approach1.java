public class Pattern1Approach1 {

    public static void printPatternForGivenRow(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*"); // we print n starts
        } 
        System.out.println(); // print a new line
    }
    public static void f(int n, int totalStars) {
        if(n <= 0) return;

        printPatternForGivenRow(totalStars); // call this function to print pattern for the given row
        f(n-1, totalStars);
    }

    public static void main(String[] args) {
        f(5, 5);
    }
}
