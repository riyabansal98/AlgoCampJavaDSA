public class Bubblesort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            boolean isSwapped = false; // this variable tracks whether we did any swap during the iteration or not
            // if we do no swap, and this remains false, that shows array is sorted
            for(int j = 0; j < n - i - 1; j++) {
                // this loop goes in the unsorted starting part, and swaps adjancent elements to move bigger elements on right
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,9,6,8,5,4,9};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}