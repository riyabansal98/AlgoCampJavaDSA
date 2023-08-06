public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        f(arr, arr.length - 1, 0);

        System.out.println("Sorted Array:");
        printArray(arr);

    }

    public static void f(int[] arr, int k, int i) {
        if (k == 0) {
            return;
        }
        if (i == k) {
            f(arr, k - 1, 0);
            return;
        }
        if (arr[i] > arr[i + 1]) {
            swap(arr, i, i + 1);
        }

        f(arr, k, i + 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
