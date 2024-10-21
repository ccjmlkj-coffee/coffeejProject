package com.coffee.alg.link;

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode node = ListNode.getNodeListByArr(new int[]{1,2,3,4,5});
        removeNthFromEnd(node,2);
        System.out.println(node.toString(node));
    }
    static ListNode removeNthFromEnd(ListNode node,int n){
        ListNode fast= new ListNode(-1);
        fast.next = node;
        ListNode slow = new ListNode(-1);
        slow.next = node;
        ListNode tmp = new ListNode();
        int i = 0;
        while (fast!=null){
            if (i>=n){
                tmp = slow;
                slow=slow.next;
            }
            fast=fast.next;
            i++;
        }
        tmp.next = tmp.next.next;
        return node;
    }

    public  static ListNode removeNthFromEndV2(ListNode head, int n) {
        //新建一个虚拟头节点指向head
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        //快慢指针指向虚拟头节点
        ListNode fastIndex = dummyNode;
        ListNode slowIndex = dummyNode;

        // 只要快慢指针相差 n 个结点即可
        for (int i = 0; i <= n; i++) {
            fastIndex = fastIndex.next;
        }
        while (fastIndex != null) {
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }

        // 此时 slowIndex 的位置就是待删除元素的前一个位置。
        // 具体情况可自己画一个链表长度为 3 的图来模拟代码来理解
        // 检查 slowIndex.next 是否为 null，以避免空指针异常
        if (slowIndex.next != null) {
            slowIndex.next = slowIndex.next.next;
        }
        return dummyNode.next;
    }

}
