package com.coffee.alg.link;

public class ListNode
{
    // 结点的值
    int val;

    // 下一个结点
    ListNode next;

    // 节点的构造函数(无参)
    public ListNode() {
    }

    // 节点的构造函数(有一个参数)
    public ListNode(int val) {
        this.val = val;
    }

    // 节点的构造函数(有两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString(ListNode node){
        StringBuilder sb = new StringBuilder();
        sb.append(node.val).append("->");
        while (node.next!=null){
            next = node.next;
            sb.append(next.val).append("->");
            node = node.next;
        }
        return sb.toString();
    }

    public static ListNode getNodeListByArr(int[] arr){
        ListNode head = new ListNode();
        if (arr == null && arr.length==0){
            return head.next;
        }
        ListNode tmp = head;
        for (int i = 0; i < arr.length; i++) {
            ListNode cur = new ListNode(arr[i]);
            tmp.next = cur;
            tmp = cur;
        }
        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(getNodeListByArr(new int[]{3, 4, 5}).toString());
        System.out.println("==");
    }


}
