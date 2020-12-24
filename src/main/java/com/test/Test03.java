package com.test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by tgf on 2019/12/20.
 */
public class Test03 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;

        //ArrayList<Integer> integers = printListFromTailToHead(node1);
        ArrayList<Integer> integers = printList(node1);
        for(Integer i : integers){
            System.out.println(i);
        }


    }

    private static ArrayList<Integer> printList(ListNode node) {
        ArrayList<Integer> arrayList = new ArrayList();

        swip(arrayList,node);

        return arrayList;
    }

    private static void swip(ArrayList<Integer> arrayList, ListNode node) {
        if(node==null){
            return;
        }
        swip(arrayList,node.next);
        arrayList.add(node.val);
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<>();

        while(listNode != null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}

class ListNode {
    int val;
    ListNode next = null;


    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
