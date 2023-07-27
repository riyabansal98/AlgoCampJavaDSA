public class firstIndex {
    public static int f(int[] arr, int idx, int x) {
        // base case
        if(idx == arr.length) return -1;
        return (arr[idx] == x) ? idx : f(arr, idx+1, x);
    }

    public static void main(String[] args) {
        int[] arr = {31,22,12, -1, 4, 5, 22, 34, 6, 7, -4, 0};
        int x = 90;
        System.out.println(f(arr, 0, x));
    }
}
