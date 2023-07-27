public class maxInArray {

    public static int f(int[] arr, int idx) {
        // base case
        if(idx == arr.length - 1) return arr[idx]; // if u r at the last index, it is your ans
        return Math.max(arr[idx], f(arr, idx+1));
    }

    public static void main(String[] args) {
        int[] arr = {31,22,12, -1, 4, 5, 22, 34, 6, 7, -4, 0};
        System.out.println(f(arr, 0));
    }
}
