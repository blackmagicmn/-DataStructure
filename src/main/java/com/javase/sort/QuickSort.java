package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class QuickSort {
    public static void main(String[] args) {
        int num=100;
        int[] arr = new int[num];
        int[] array = new int[num];
        int tmp;
        for (int i = 0; i < num; i++) {
            tmp=(int)(Math.random()*108);
            arr[i]=tmp;
            array[i]=tmp;
        }
//        int[] arr ={17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};
//        int[] array ={17, 54, 12, 34, 42, 15, 53, 8, 27, 63, 59, 34, 84, 62, 49, 35, 29, 24, 6, 30};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        Arrays.sort(arr);
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //快速排序
    private static void quickSort(int[] arr, int first, int last) {
        if(first>=last) return;
        int left=first;
        int right=last;

        int value = arr[first];
        int tmp;
        while(left < right){

            while(left<right && value<=arr[right]) right--;

            while(left<right && value>=arr[left]) left++;

            if(left<right){
                tmp=arr[right];
                arr[right]=arr[left];
                arr[left]=tmp;
            }
        }
        arr[first]=arr[left];
        arr[left]=value;
        quickSort(arr,first,left-1);
        quickSort(arr,left+1,last);

    }
}

