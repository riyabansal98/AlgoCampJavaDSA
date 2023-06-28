package L7;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = new int[5];
        System.out.println(arr);

//        int[] arr = null;
//        arr = new int[5];

        System.out.println(arr.length);

        //get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set update
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]); error

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        //Enhanced For Loop
        //forward only
        //read only
        System.out.println("-----EF-----");

        for(int val : arr) {
            System.out.println(val);
        }

//        int[] arr1 = arr;
//        arr1[3] = 100;
//        System.out.println(arr[3]);


        int i = 0; //10
        int j = 2; //30

        System.out.println("---------CASE 1-----------");
        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + ", " + arr[j]);

        System.out.println("---------CASE 2-----------");

        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr, i , j);
        System.out.println(arr[i] + ", " + arr[j]);

        System.out.println("---------CASE 3-----------");

        int[] other = {100, 200, 300};
        System.out.println(arr[0] + ", " + other[0]);
        Swap(arr, other);
        System.out.println(arr[0] + ", " + other[0]);

    }

    public static void Swap(int[] one, int[] two) {

        int[] temp = one;
        one = two;
        two = temp;
    }
    public static void swap(int[] a, int i, int j) {

        System.out.println(a[i] + ", " + a[j]);
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void swap(int one, int two) {
        int temp = one;
        one = two;
        two = temp;
    }
}
