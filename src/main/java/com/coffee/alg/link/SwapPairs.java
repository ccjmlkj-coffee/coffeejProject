package com.coffee.alg.link;

import java.util.List;

public class SwapPairs {

    public static void main(String[] args) {
        ListNode node = ListNode.getNodeListByArr(new int[]{2,3,4,5,6,7,8,89,9,0,8});
//        System.out.println(node.toString(node));
        ListNode newNode = swapPairs(node);
        System.out.println(newNode.toString(newNode));
    }

    static ListNode swapPairs(ListNode head) {
        ListNode dumyhead = new ListNode(-1); // 设置一个虚拟头结点
        dumyhead.next = head; // 将虚拟头结点指向head，这样方便后面做删除操作
        ListNode cur = dumyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;       // 步骤一
            secondnode.next = firstnode; // 步骤二
            firstnode.next = temp;      // 步骤三
            cur = firstnode; // cur移动，准备下一轮交换
        }
        return dumyhead.next;
    }
}
