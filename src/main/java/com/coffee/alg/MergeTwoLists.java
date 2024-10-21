package com.coffee.alg;

import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;

public class MergeTwoLists {


    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        ListNode node4 = new ListNode();
        node1.val=2;
        node1.next = node2;
        node2.val=4;
        node2.next=node3;
        node3.val=9;
        node3.next = node4;
        node4.val=10;

        ListNode ans =  mergeTwoLists(node1,node3);
        System.out.println(ans);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    }

