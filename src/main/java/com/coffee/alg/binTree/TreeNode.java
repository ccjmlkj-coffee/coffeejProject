package com.coffee.alg.binTree;

import java.io.Serializable;

public class TreeNode implements Serializable {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){

    }

    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int val){
        this.val = val;
    }
}
