package com.coffee.alg.binTree;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class InvertTree implements Serializable {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        head.left = left;
        head.right = right;
        TreeNode ll = new TreeNode(7);
        TreeNode lll = new TreeNode(6);
        TreeNode rl = new TreeNode(5);
        TreeNode rr = new TreeNode(4);
        left.left = ll;
        ll.left = lll;
        right.right = rr;
        right.left = rl;
        invertTree(head);
        System.out.println("翻转二叉树->"+head);
        invertTreeByStack(head);
        System.out.println("翻转二叉树->"+head);


        InvertTree invertTree = new InvertTree();

    }

    public static void invertTree(TreeNode root){
        if (root == null) return;
        swapNode(root);
        invertTree(root.left);
        invertTree(root.right);
    }

    public static void swapNode(TreeNode root){
        TreeNode right = root.right;
        root.right = root.left;
        root.left = right;
    }

    public static void invertTreeByStack(TreeNode root){
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode tmp = stack.peek();
            stack.pop();
            swapNode(tmp);
            if (tmp.right != null) stack.push(tmp.right);
            if (tmp.left != null) stack.push(tmp.left);

        }

    }
}
