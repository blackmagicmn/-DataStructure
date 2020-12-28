package com.javase.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by tgf on 2020/12/24.
 */
public class BucketSort {
    public static void main(String[] args) {

        int[] arr = new int[20];
        int[] array = new int[20];
        int tmp;
        for (int i = 0; i < 20; i++) {
            tmp=(int)(Math.random()*20);
            arr[i]=tmp;
            array[i]=tmp;
        }


//        int[] arr = {17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};
//        int[] array ={17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        Arrays.sort(arr);
        array=bucketSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    private static void AbucketSort(int[] array) {
    }

    //桶排序
    public static int[] bucketSort(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }

    /*桶映射函数：自己设计，要保证桶 i 的数均小于桶 j （i < j）的数，
      即必须桶间必须有序，桶内可以无序。这里桶映射函数为：(i - min) / arr.length*/
        int bucketNum = (max - min) / array.length + 1;
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<>(bucketNum);
        for(int i = 0; i < bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }

        //将每个元素放入桶
        for(int i = 0; i < array.length; i++){
            int num = (array[i] - min) / (array.length);
            bucketArr.get(num).add(array[i]);
        }

        //对每个桶进行排序
        for(int i = 0; i < bucketArr.size(); i++){
            Collections.sort(bucketArr.get(i));
        }

        int k = 0;
        for(int i = 0; i < bucketArr.size(); i++){
            for(int j = 0;j < bucketArr.get(i).size();j++) {
                array[k++] = bucketArr.get(i).get(j);
            }
        }
        return array;
    }
}

