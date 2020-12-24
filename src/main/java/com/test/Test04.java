package com.test;

import java.util.Stack;

/**
 * Created by tgf on 2019/12/20.
 */
public class Test04 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.search(4));


    }


}
