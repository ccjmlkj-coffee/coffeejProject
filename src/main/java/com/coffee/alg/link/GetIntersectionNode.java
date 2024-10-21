package com.coffee.alg.link;

public class GetIntersectionNode {

    public static void main(String[] args) {
        ListNode node = ListNode.getNodeListByArr(new int[]{2, 3, 4, 5, 6, 7, 8, 89, 9, 0});
        ListNode node2 = ListNode.getNodeListByArr(new int[]{2, 3, 4, 5});
        node2.next.next.next.next = node.next.next;
        System.out.println(getNodeLen(node));
        /**
         * 为什么node.string() 会改变链表结构？
         */
        ListNode curNode = getNodeByIndex(node, 3);
        System.out.println(getNodeByIndex(node, 3));
        ListNode res = getIntersectionNode(node, node2);
        System.out.println(res);
    }

    public static ListNode getIntersectionNode(ListNode node1, ListNode node2) {
        int len1 = getNodeLen(node1);
        int len2 = getNodeLen(node2);
        int fastIndex = Math.max(len1 - len2, len2 - len1);
        int slowIndex = 0;
        if (len1 > len2) {
            while (getNodeByIndex(node1, fastIndex) != null) {
                ListNode fastNode = getNodeByIndex(node1, fastIndex);
                ListNode slowNode = getNodeByIndex(node2, slowIndex);
                if (fastNode == slowNode) {
                    return fastNode;
                }
                fastIndex++;
                slowIndex++;
            }
        } else {
            while (getNodeByIndex(node2, fastIndex) != null) {
                ListNode fastNode = getNodeByIndex(node2, fastIndex);
                ListNode slowNode = getNodeByIndex(node1, slowIndex);
                if (fastNode == slowNode) {
                    return fastNode;
                }
                fastIndex++;
                slowIndex++;
            }
        }

        return null;
    }

    public static int getNodeLen(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }

    public static ListNode getNodeByIndex(ListNode node, int index) {
        ListNode ans = new ListNode();
        if (index >= getNodeLen(node)) {
            return null;
        }
        while (index >= 0 && node != null) {
            ans = node;
            node = node.next;
            index--;
        }
        return ans;
    }


    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        while (curA != null) { // 求链表A的长度
            lenA++;
            curA = curA.next;
        }
        while (curB != null) { // 求链表B的长度
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        // 让curA为最长链表的头，lenA为其长度
        if (lenB > lenA) {
            //1. swap (lenA, lenB);
            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;
            //2. swap (curA, curB);
            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;
        }
        // 求长度差
        int gap = lenA - lenB;
        // 让curA和curB在同一起点上（末尾位置对齐）
        while (gap-- > 0) {
            curA = curA.next;
        }
        // 遍历curA 和 curB，遇到相同则直接返回
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }


    public ListNode getIntersectionNodeV3(ListNode headA, ListNode headB) {
        // p1 指向 A 链表头结点，p2 指向 B 链表头结点
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            // p1 走一步，如果走到 A 链表末尾，转到 B 链表
            if (p1 == null) p1 = headB;
            else p1 = p1.next;
            // p2 走一步，如果走到 B 链表末尾，转到 A 链表
            if (p2 == null) p2 = headA;
            else p2 = p2.next;
        }
        return p1;
    }

}
