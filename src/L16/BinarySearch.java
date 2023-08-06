package L16;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6 ,7, 8, 9, 11, 12, 13, 15, 16};

        System.out.println(binarySearch(arr, 1));
    }

    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
//            System.out.print(left + " " + right);
//            System.out.println();
            int mid = (left + right) / 2;
//            System.out.print(mid);
//            System.out.println();
            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {

                //towards the right of mid to find the answer
                left = mid + 1;
            }else{
                //towards the left of mid to find the answer
                right = mid  - 1;
            }
        }

        return -1;
    }
}
