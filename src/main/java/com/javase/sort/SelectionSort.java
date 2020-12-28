package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] array = new int[20];
        int tmp;
        for (int i = 0; i < 20; i++) {
            tmp=(int)(Math.random()*108);
            arr[i]=tmp;
            array[i]=tmp;
        }
//        int[] arr ={17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};
//        int[] array ={17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        Arrays.sort(arr);
        selectionSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //选择排序
    public static  void selectionSort(int[] arr){
        int tmp;
        int index;
        for (int i = 0; i < arr.length-1 ; i++) {
            index=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[index]>arr[j]){
                    index=j;
                }
            }

            //如果 index 和 i 索引相同,不需要交换
            if(index!=i){
                tmp=arr[i];
                arr[i]=arr[index];
                arr[index]=tmp;
            }

        }
        //System.out.println("循环次数: " + num);

    }
}

