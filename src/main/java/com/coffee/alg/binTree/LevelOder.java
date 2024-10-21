package com.coffee.alg.binTree;

import java.util.*;

/**
 * BFS-广度优先搜索
 */
public class LevelOder {

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

        List<List<Integer>> result = leverOrder(head);
        System.out.println("层序遍历->"+result);
        System.out.println("递归层序遍历->"+levelOrderV2(head));
        Collections.reverse(result);
        System.out.println("层序遍历翻转->"+result);


    }

    /**
     * 利用队列，迭代遍历
     * @param root
     * @return
     */
    public static List<List<Integer>> leverOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        Queue<TreeNode> levelStack = new LinkedList<>();
        levelStack.add(root);
        Queue<TreeNode> nextStack = new LinkedList<>();
        List<Integer> levelAns = new ArrayList<>();
        while (!levelStack.isEmpty() || !nextStack.isEmpty()){
            if (levelStack.isEmpty()){
                levelStack = nextStack;
                nextStack = new LinkedList<>();
            }
            while (!levelStack.isEmpty()){
                TreeNode cur = levelStack.peek();
                if (cur!=null){
                    levelStack.poll();
                    levelAns.add(cur.val);
                    if (cur.left!=null) nextStack.add(cur.left);

                    if (cur.right!=null) nextStack.add(cur.right);

                }
            }
            ans.add(levelAns);
            levelAns = new ArrayList<>();
        }


        return ans;
    }

    public static List<List<Integer>> levelOrderV2(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        recursionLevelOrderV2(root,result,0);
        return result;
    }

    public static void recursionLevelOrderV2(TreeNode root,List<List<Integer>> result,int depth){
        if (root == null) return;
        if (result.size() == depth) result.add(new ArrayList<>());
        int val = root.val;
        result.get(depth).add(val);
        recursionLevelOrderV2(root.left,result,depth+1);
        recursionLevelOrderV2(root.right,result,depth+1);
    }
}
