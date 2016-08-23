package Golovach.JavaCore.Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by trizhdydva on 16.08.2016.
 */
public class SelectionSort {
    public static void vyborSort(int[] data) {
//        for (int barier = 0; barier < data.length - 1; barier++) {
//            int element = data[barier];
//            int count = barier;
//            for (int index = barier + 1; index < data.length; index++) {
//                if (element>data[index]){
//                    element = data[index];
//                    count = index;
//                }
//            }
//            if (count != barier){
//                int tmp = data[barier];
//                data[barier] = element;
//                data[count] = tmp;
//            }
//
//        }
        for(int barier = 0; barier < data.length-1; barier++){
            for (int index = barier+1; index<data.length; index++){
                if (data[barier]>data[index]){
                    int tmp = data[barier];
                    data[barier] = data[index];
                    data[index] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[32*1024];
        Random rnd = new Random();
        for (int j = 0; j < array.length; j++){
            array[j] = rnd.nextInt();
        }
        long t1 = System.nanoTime();
        vyborSort(array);
//        System.out.println(Arrays.toString(i));
        System.out.println((System.nanoTime() - t1)/1000000);
//        System.out.println(Arrays.toString(array));
    }
}
