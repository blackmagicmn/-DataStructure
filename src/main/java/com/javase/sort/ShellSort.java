package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class ShellSort {
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
        shellSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //插入排序
    public static  void shellSort(int[] arr){

        int index;

        int num = arr.length>>1;
        while(num>0){
            for (int i = 0; i < arr.length-num ; i++) {
                int value=arr[i+num];
                index=i+num;
                for (int j = i+num; j-num>=0 && value < arr[j-num] ; j-=num) {
                    arr[j]=arr[j-num];
                    index-=num;
                }
                if(index!=i+num){
                    arr[index]=value;
                }

            }

            num >>= 1;
        }




    }
}

