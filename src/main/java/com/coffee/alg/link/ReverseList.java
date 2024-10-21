package com.coffee.alg.link;

public class ReverseList {

    public static void main(String[] args) {
//        reverseList();
        ListNode node = ListNode.getNodeListByArr(new int[]{2,3,4,5,6,7,8,89,9,0});
        ListNode.getNodeListByArr(new int[]{3,5,6,4,2,7,8,5});
        node = reverseList(node);
        System.out.println(node.toString(node));
        ListNode node1 = reverseListV2(ListNode.getNodeListByArr(new int[]{3,5,6,4,2,7,8,5}));
        System.out.println(node.toString(node1));
    }

    static ListNode reverseList(ListNode head){
        if (head==null || head.next==null ){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur.next != null){
            ListNode now = cur.next;
            cur.next = pre;
            pre = cur;
            cur = now;
        }
        cur.next = pre;
        return cur;
    }

    static ListNode reverseListV2(ListNode head){
       return reverseListRecursion(null,head);
    }

    static ListNode reverseListRecursion(ListNode pre,ListNode cur){
        if (cur==null){
            return pre;
        }
        ListNode nextCur = cur.next;
        cur.next=pre;
        pre = cur;
        return reverseListRecursion(pre,nextCur);
    }
}
