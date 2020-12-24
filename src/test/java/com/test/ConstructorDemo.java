package com.test;

/**
 * Created by tgf on 2020/6/1.
 */
public class ConstructorDemo {
    String str;

    private ConstructorDemo(){
        str="qwer";
    }
    public static void main(String[] args) {
        System.out.println(new ConstructorDemo().str );
    }


}
