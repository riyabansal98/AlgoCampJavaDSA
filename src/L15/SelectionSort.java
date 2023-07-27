public class SelectionSort {

    // this function returns the index of the minimum element in arr in the range [start, n-1]
    // [1,2,3,9,6,8,5,4,9] , start = 3, minIndex = 7, i = 8
    public static int getMinimumIndex(int[] arr, int start) {
        int minIndex = start; // initially we assume that the start index has the minimum value
        for(int i = start + 1; i < arr.length; i++) {
            // we go in the remaining array from [start+1, n-1]
            if(arr[i] < arr[minIndex]) {
                // compare if current element is better than the last found minimum element
                minIndex = i;
            }
        }
        return minIndex;
    }

    // this function applies selection sort on the given array and arranges element in inx order
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = getMinimumIndex(arr, i); // get the minimum element from undersorted region i.e. [i, n-1]
            if(i != minIndex) { // if ith element is the min dont swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,9,6,8,5,4,9};
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
