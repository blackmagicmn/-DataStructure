package com.test;

/**
 * Created by tgf on 2019/12/20.
 */
public class Test01 {
    public static void main(String[] args) {
        int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};


        System.out.println(find(16,a));
    }

    private static boolean find(int target, int[][] array) {

        /*if(array==null || array.length<1 || array[0].length<1 ){
            return false;
        }*/
        int row = 0;
        int column = array[0].length-1;

        while(row<=array.length-1 && column>=0){
            int value = array[row][column];
            if(target>value){
                row++;
            }else if(target<value){
                column--;
            }else {
                return true;
            }

        }

        return false;
    }
}
