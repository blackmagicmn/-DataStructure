package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class BubbleSort {
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
        bubbleSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //冒泡排序
    public static  void bubbleSort(int[] arr){
        int tmp;
        int num = 0;
        int tag = arr.length-1;
        int t = 0;
        for (int i = 1; i <= arr.length-1 ; i++) {
            int count=0;
            for (int j = 0; j < tag ; j++) {
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    count++;
                    t=j;
                }
                num++;
            }
            //如果没发生交换说明已经有序,退出
            if(count==0) {System.out.println("循环的次数: " + num); return;}
            tag=t;
        }
        System.out.println("循环次数: " + num);

    }
}

