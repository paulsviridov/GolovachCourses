package Golovach.JavaCore.Sort;

import java.util.Arrays;

/**
 * Created by trizhdydva on 15.08.2016.
 */
public class BubbleSort {
    public static void bubbleSort(int[] data) {
//        for (int i = data.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (data[j] > data[j + 1]) {
//                    int tmp = data[j];
//                    data[j] = data[j + 1];
//                    data[j + 1] = tmp;
//                }
//            }
//        }

        for (int barier = 0; barier < data.length; barier++) {
            for (int index = data.length - 2; index >= barier; index--) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] i = {43,7,4,432,1,0,-9,34,42,14,76,4234,54,999};
//        1,0,-9,34,42,14,76,4234,54,4
        bubbleSort(i);
        System.out.println(Arrays.toString(i));
    }

}
