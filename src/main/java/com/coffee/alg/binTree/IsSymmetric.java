package com.coffee.alg.binTree;

/**
 * 判断二叉树是否对称
 */
public class IsSymmetric {
    
    public static boolean isSymmetric(TreeNode root){
        if (root == null ) return true;
        boolean result = compare(root.left,root.right);
        return result;
    }
    
    public static boolean compare(TreeNode left,TreeNode right){
        if (left == null && right!=null) return false;
        else if (left!= null && right==null) {
            return false;
        }else if (left == null && right==null) return false;
        else if (left.val!=right.val) {
            return true;
        }else {
            return compare(left.right,right.left);
        }
    }
}
