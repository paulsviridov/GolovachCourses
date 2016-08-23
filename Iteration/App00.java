package Golovach.JavaCore.Iteration;

import java.util.Arrays;

/**
 * Created by trizhdydva on 15.08.2016.
 */
public class App00 {
    public static void invert(int[] data){
//        for (int i = 0; i < data.length / 2; i++){
//            int tmp = data[i];
//            data[i] = data[data.length - 1 - i];
//            data[data.length-1-i] = tmp;
//        }

        for (int i = data.length/2; i > 0; i--){
            int tmp = data[i-1];
            data[i-1] = data[data.length-i];
            data[data.length-i] = tmp;

        }

        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,8};
        int[] j = {0,2,3};
        int[] k = {0};

        invert(i);
        invert(j);
        invert(k);
    }
}
