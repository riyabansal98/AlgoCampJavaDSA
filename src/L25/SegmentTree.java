package L25;

import java.util.Scanner;

public class SegmentTree {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] arr = {1, 3, 6, 5, 10, 7};

        int[] tree = new int[4 * arr.length];


        buildTree(arr, tree, 0, arr.length - 1, 0);

    }

    private static void buildTree(int[] arr, int[] tree, int start, int end, int idx) {
        if(start == end) {
            tree[idx] = arr[start];
            return;
        }

        int mid = (start + end) / 2;
        //left
        int leftIdx = 2 * idx + 1;
        int rightIdx  =  2 * idx + 2;

        buildTree(arr, tree, start, mid, leftIdx);
        buildTree(arr, tree, mid + 1, end, rightIdx);

        tree[idx] = tree[leftIdx] + tree[rightIdx];

    }

    //idx -> is the index which needs to be updated
    //index -> index of the range stored in segment tree
    private static void updateValue(int[] arr, int[] tree, int left, int right, int idx,  int newVal, int index) {

        if(idx < left || idx > right) {
            return;
        }

        if(left == right) {

            arr[idx] = newVal;
            tree[idx] = newVal;
            return;
        }


        int mid = (left + right) / 2;
        int leftIdx = 2 * idx + 1;
        int rightIdx  =  2 * idx + 2;

        updateValue(arr, tree, left, mid, idx, newVal, leftIdx);
        updateValue(arr, tree, mid + 1, right, idx, newVal, rightIdx);

        tree[index] = tree[leftIdx] + tree[rightIdx];
    }

    private static int query(int[] tree, int left, int right, int qleft, int qright, int index) {

        if(qleft > right || qright < left) {
            return 0;
        }

        if(qleft <= left && qright >= right) {
            return tree[index];
        }

        int mid = (left + right) / 2;
        int leftIdx = 2 * index + 1;
        int rightIdx  =  2 * index + 2;

        int leftSum = query(tree, left, mid, qleft, qright, leftIdx);
        int rightSum = query(tree, mid + 1, right, qleft, qright, leftIdx);

        return leftSum + rightSum;

    }
}
