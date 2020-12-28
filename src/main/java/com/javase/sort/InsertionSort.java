package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class InsertionSort {
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
        insertionSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //插入排序
    public static  void insertionSort(int[] arr){
        int index;
        int value;
        for (int i = 0; i < arr.length-1 ; i++) {
            value=arr[i+1];
            index=i+1;
            for (int j = i+1; j>0 && value < arr[j-1] ; j--) {
                arr[j]=arr[j-1];
                index=j-1;
            }

            //找到arr[i+1]最终的位置再赋值
            if(index!=i+1){
                arr[index]=value;
            }

        }
        //System.out.println("循环次数: " + num);

    }
}

