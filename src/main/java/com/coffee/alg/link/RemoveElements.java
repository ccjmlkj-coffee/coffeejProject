package com.coffee.alg.link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode result = removeElements(ListNode.getNodeListByArr(new int[]{3,5,6,4,2,7,8,5}),8);

        System.out.println(result.toString(result));

        ListNode result2 =  removeElementsV2(ListNode.getNodeListByArr(new int[]{3,5,6,4,5,2,7,8,5}),8);
        System.out.println(result.toString(result2));

        ListNode result3 =  removeElementsV3(ListNode.getNodeListByArr(new int[]{3,5,6,4,5,2,7,8,5}),8);
        System.out.println(result.toString(result3));
    }

    public static ListNode removeElements(ListNode head,int target){
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            if (head.val!=target){
                list.add(head.val);
            }
            head=head.next;
        }
        int[] arr  = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        ListNode node = ListNode.getNodeListByArr(arr);

        return node;
    }

    public static ListNode removeElementsV2(ListNode head,int target){
        ListNode preAns = new ListNode(-1,head);
        ListNode pre = preAns;
        ListNode cur = head;
        while (cur!=null){
            if (cur.val==target){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur=cur.next;
        }
        return preAns.next;
    }

    public static ListNode removeElementsV3(ListNode head,int target){
        //处理头节点，至非等于target
        while(head!=null && head.val==target){
            head = head.next;
        }
        ListNode ans = head;
        //处理非头部节点
        while(head!=null && head.next != null){
            if (head.next.val == target){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return ans;
    }


}
