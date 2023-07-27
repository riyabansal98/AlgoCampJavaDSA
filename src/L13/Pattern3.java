public class Pattern3 {
    public static void f(int row, int col, int n) {
        if(row > n) return; // all rows are printed
        if(col > n - row + 1) { // everything is printed in curr row
            System.out.println(); // newline before going to next row
            f(row + 1, 1, n); // all col of given row are done, move to next row
            return; 
        }
        System.out.print("*");
        f(row, col+1, n); // move to the next col
    }
    public static void main(String[] args) {
        f(1, 1, 5);
    }
}
