package L7;

public class ArrayQues {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
//        display(arr);
//        reverse(arr);
//        display(arr);

        minimumEle(arr);
    }

    public static void display(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void reverse(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void minimumEle(int[] arr) {

        int min = Integer.MAX_VALUE;
        //int min = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(min);

    }
}
