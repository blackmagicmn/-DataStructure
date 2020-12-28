package com.javase.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by tgf on 2020/12/24.
 */
public class HeapSort {
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
        heapSort(array);
        System.out.println(Arrays.equals(arr,array));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));


    }

    //堆排序

    //声明全局变量，用于记录数组array的长度；
    static int len;

    public static int[] heapSort(int[] array) {
        len = array.length;
        if (len == 0) return array;
        //1.构建一个大根堆
        buildMaxHeap(array);
        //2.循环将堆顶（最大值）与堆尾交换，删除堆尾元素，然后重新调整大根堆
        while (len > 0) {
            swap(array,0,len-1);
            len--; //原先的堆尾进入有序区，删除堆尾元素
            adjustHeap(array, 0); //重新调整大根堆
        }
        return array;
    }

    /**
     * 自顶向下调整以 i 为根的堆为大根堆
     * @param array
     * @param i
     */
    public static void adjustHeap(int[] array, int i) {
        int maxIndex = i;
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (2 * i + 1 < len && array[2 * i + 1] > array[maxIndex])
            maxIndex = 2 * i + 1;
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (2 * i + 2 < len && array[2 * i + 2] > array[maxIndex])
            maxIndex = 2 * i + 2;
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustHeap(array, maxIndex);
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void buildMaxHeap(int[] array){
        int heapSize=array.length;
        for(int i=heapSize/2;i>0;i--){
            maxHeapify(array, i);
        }
    }

    public static void maxHeapify(int[] a,int index){
        int l=index*2;
        int r=l+1;
        int largest;
        int heapSize=a.length;
        if(l<=heapSize && a[l-1]>a[index-1]){
            largest=l;
        }
        else{
            largest=index;
        }
        if(r<=heapSize && a[r-1]>a[largest-1]){
            largest=r;
        }
        if(largest != index){
            int temp=a[index-1];
            a[index-1]=a[largest-1];
            a[largest-1]=temp;
            maxHeapify(a,largest);
        }

    }
}

