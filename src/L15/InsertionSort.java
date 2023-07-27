public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int currElement = arr[i];
            int j = i - 1; // we want to go on the left side of i, and insert currElement at its correct pos
            while(j >= 0 && arr[j] > currElement) {
                arr[j+1] = arr[j]; // shifting the elements
                j--;
            }
            arr[j+1] = currElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,9,6,8,5,4,9};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
