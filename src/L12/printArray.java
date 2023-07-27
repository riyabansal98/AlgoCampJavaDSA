public class printArray {

    public static void f(int[] arr, int idx) { // function prints everything from idx->n-1
        // base case
        if(idx >= arr.length) return; // everything is printed, dont do anything now

        System.out.println(arr[idx]); // self work
        f(arr, ++idx); // recursive assumption / delegation
    }

    public static void main(String[] args) {
        int[] arr = {31,22,12};
        f(arr, 0); // we want to print everything from 0-> n-1
    }
}
