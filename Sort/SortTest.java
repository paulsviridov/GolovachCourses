package Golovach.JavaCore.Sort;

import java.util.Arrays;

/**
 * Created by trizhdydva on 15.08.2016.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] arr = {756,5,3423,5,342,-2,0,324,1,4,423,456,9};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
