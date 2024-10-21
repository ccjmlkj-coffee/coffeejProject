package com.coffee.alg;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        ListNode node3 = new ListNode();
        node1.val=5;
        node1.next = node2;
        node2.val=4;
        node2.next=node3;
        node3.val=9;


//        ListNode result = reverseList(node1);
        ListNode result2 =reverseKGroup(node1,2);

//        System.out.println(result);
        System.out.println(result2);
    }

    static ListNode reverseList(ListNode node )
    {
        Stack<ListNode> stack = new Stack<>();
        stack.push(node);
        while (node.next != null){
            node = node.next;
            stack.push(node);
        }
        ListNode result = stack.peek();
        while (!stack.isEmpty()&&stack.peek() != null ){
            ListNode cur = stack.pop();
            if (!stack.isEmpty() && stack.peek()!=null){
                cur.next = stack.peek();
            }else{
                cur.next = null;
            }
        }
        return result;
    }

    public ListNode reverseListV2(ListNode head) {
        ListNode cur = head, pre = null;
        while(cur != null) {
            ListNode tmp = cur.next; // 暂存后继节点 cur.next
            cur.next = pre;          // 修改 next 引用指向
            pre = cur;               // pre 暂存 cur
            cur = tmp;               // cur 访问下一节点
        }
        return pre;
    }

    static ListNode reverseKGroup(ListNode head,int k ){
        ListNode hair = new ListNode(0);
        hair.next = head;
        ListNode pre = hair;

        while (head != null) {
            ListNode tail = pre;
            // 查看剩余部分长度是否大于等于 k
            for (int i = 0; i < k; ++i) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }
            ListNode nex = tail.next;
            ListNode[] reverse = myReverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            // 把子链表重新接回原链表
            pre.next = head;
            tail.next = nex;
            pre = tail;
            head = tail.next;
        }

        return hair.next;
    }

    public static ListNode[] myReverse(ListNode head, ListNode tail) {
        ListNode prev = tail.next;
        ListNode p = head;
        while (prev != tail) {
            ListNode nex = p.next;
            p.next = prev;
            prev = p;
            p = nex;
        }
        return new ListNode[]{tail, head};
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
