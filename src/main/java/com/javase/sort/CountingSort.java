package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class CountingSort {
    public static void main(String[] args) {

        int[] arr = new int[20];
        int[] array = new int[20];
        int tmp;
        for (int i = 0; i < 20; i++) {
            tmp=(int)(Math.random()*108);
            arr[i]=tmp;
            array[i]=tmp;
        }


//        int[] arr = {17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};
//        int[] array ={17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        Arrays.sort(arr);
        array=countingSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //计数排序
    public static int[] countingSort(int[] array){
        if (array.length == 0) return array;
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < array.length; i++) {
            bucket[array[i] + bias]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        return array;
    }
}

