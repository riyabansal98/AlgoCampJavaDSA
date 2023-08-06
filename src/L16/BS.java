package L16;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BS {

    public static void main(String[] args) {

        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(Arrays.binarySearch(vowels, 'i'));

        int[] arr = {1, 2, 3, 4, 5};
        //sorted in ascending order
        System.out.println(Arrays.binarySearch(arr, 1));

        //(-(insertionPoint) - 1)    => (-2 - 1) => -3
        //(-(2)-1) -> -3




    }
}
