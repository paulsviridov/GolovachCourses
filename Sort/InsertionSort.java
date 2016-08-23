package Golovach.JavaCore.Sort;

import java.util.Arrays;

/**
 * Created by trizhdydva on 21.08.2016.
 */
public class InsertionSort {
    public static void PeasteSort(int[] data){
//        for (int barier = 1; barier < data.length; barier++){
//            int position = barier - 1;
//            int tmp = data[barier];
//            while (position >=0 && tmp < data[position]){
//                data[position+1] = data[position];
//                position--;
//            }
//            data[position+1] = tmp;
//        }
        for (int barier = 1; barier < data.length; barier++){
            int position = barier - 1;
            int tmp = data[barier];
            while (position >=0 && tmp < data[position]){

            }
            data[position+1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] i = {2,0,434,5,-8,3,1,1,0,543,3,2};
        PeasteSort(i);
        System.out.println(Arrays.toString(i));
    }
}
