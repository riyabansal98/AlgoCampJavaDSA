class Factorial {

    public static int f(int n) {
        // base case 
        if(n == 1) return 1;
        return n * f(n-1); // function works correctly for n-1
    }

    public static void main(String[] args) {
        System.out.println(f(4));
    }
}