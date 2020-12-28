package com.javase.sort;

import java.util.Arrays;

/**
 * Created by tgf on 2020/12/24.
 */
public class MergeSort {
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
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //归并排序
    public static  void mergeSort(int[] arr,int first,int last){
        if(first>=last) return;

        int index = (first + last) >> 1;
        mergeSort(arr,first,index);
        mergeSort(arr,index+1,last);

        merge(arr,first,index,last);

    }

    private static void merge(int[] arr, int first, int index, int last) {
        if(first>=last || arr[index]<=arr[index+1]) return;
        int top1=first;
        int top2=index+1;

        int[] tmp = new int[last-first+1];

        for (int i = 0; i <tmp.length ; i++) {

            //2边索引在范围内
            if(top1<=index && top2<=last){
                if(arr[top1]<=arr[top2]){
                    tmp[i]=arr[top1++];
                }else {
                    tmp[i]=arr[top2++];
                }
                continue;
            }

            //1边索引已跑完
            if(top1>index){
                tmp[i]=arr[top2++];
            }else{
                tmp[i]=arr[top1++];
            }
        }

        for (int i = 0; i < tmp.length ; i++) {
            arr[i+first]=tmp[i];
        }

    }
}

