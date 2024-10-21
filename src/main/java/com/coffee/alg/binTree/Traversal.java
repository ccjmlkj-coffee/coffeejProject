package com.coffee.alg.binTree;

//import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.*;

/**
 * 树的遍历
 */
public class Traversal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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

        List<Integer> result = preTraversal(head);
        System.out.println("递归前序遍历->"+result);
        System.out.println("递归中序遍历->"+midTraversal(head));
        System.out.println("递归后续遍历->"+afterTraversal(head));
        System.out.println("迭代器前序遍历->"+preTraverByStack(head));
        System.out.println("迭代器中序遍历->"+midTraversalByStack(head));
//        System.out.println("迭代器中序遍历->"+afterTraversalByStack(head));
        System.out.println("迭代器中序遍历->"+preTraversalTreeByStackOne(head));

//        String treeNodePath = "/Users/makaijian/Desktop/workSpace/huya/code/java/coffeejProject/src/main/java/com/coffee/alg/binTree/node.txt";
//        ByteOutputStream bos  = new ByteOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(bos);
//        oos.writeObject(head);
//        byte[] bytes = bos.toByteArray();
//        File file = new File(treeNodePath);
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
////        ois.read();
//        TreeNode head2 = (TreeNode) ois.readObject();
//        System.out.println(head2);
//
//        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
//        ObjectInputStream objis = new ObjectInputStream(bis);
//        TreeNode head3 = (TreeNode) objis.readObject();
//        System.out.println(head3);


    }


    /**
     * 前序遍历
     * @param node
     * @return
     */
    public static List<Integer> preTraversal(TreeNode node){
        List<Integer> result = new ArrayList<>();
        preTraversalTree(node,result);
        return result;
    }

    /**
     * 前序遍历递归方法
     * @param node
     * @param result
     */
    public static void preTraversalTree(TreeNode node,List<Integer> result){
        if (node == null) {
            return;
        }
        int val = node.val;
        result.add(val);
        preTraversalTree(node.left,result);
        preTraversalTree(node.right,result);

    }

    /** 是否递归算法，都可以用栈来实现？
     * 迭代器方法，前序遍历二叉树
     * @param node
     * @return
     */
    public static List<Integer> preTraverByStack(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        List<Integer> ans = new ArrayList<>();
        while (!stack.isEmpty() && stack.peek()!=null){
            TreeNode tmp = stack.pop();
            ans.add(tmp.val);
            if (tmp.right!=null){
                stack.push(tmp.right);
            }
            if (tmp.left!=null){
                stack.push(tmp.left);
            }
        }
        return ans;
    }

    public static List<Integer> midTraversal(TreeNode node){
        List<Integer> ans = new ArrayList<>();
        midTraversalTree(node,ans);
        return ans;
    }

    /**
     * 二叉树中序遍历方法
     * @param node
     * @param result
     */
    public static void midTraversalTree(TreeNode node,List<Integer> result){
        if (node == null){
            return;
        }
        midTraversalTree(node.left,result);
        int val = node.val;
        result.add(val);
        midTraversalTree(node.right,result);
    }

    /**
     * 使用栈实现迭代器中序遍历
     * @param root
     * @return
     */
    public static List<Integer> midTraversalByStack(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }

    public static List<Integer> afterTraversalByStack(TreeNode node){
            List<Integer> result = new ArrayList<>();
            if (node == null){
                return result;
            }
            Stack<TreeNode> stack = new Stack<>();
            stack.push(node);
            while (!stack.isEmpty()){
                TreeNode cur = stack.pop();
                result.add(node.val);
                if (cur.left != null){
                    stack.push(node.left);
                }
                if (cur.right != null){
                    stack.push(cur.right);
                }
            }
            Collections.reverse(result);
            return result;

    }

    public static List<Integer> afterTraversal(TreeNode node){
        List<Integer> ans = new ArrayList<>();
        afterTraversalTree(node,ans)
        ;
        return ans;
    }

    public static void afterTraversalTree(TreeNode node,List<Integer> result){
        if (node == null){
            return;
        }
        afterTraversalTree(node.right,result);
        afterTraversalTree(node.left,result);
        int val = node.val;
        result.add(val);
    }

    public static List<Integer> preTraversalTreeByStackOne(TreeNode root){
//        List<Integer> ans = new ArrayList<>();
//        if (node == null){
//            return  ans;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(node);
//        while (!stack.isEmpty()){
//            if (stack.peek() != null){
//                TreeNode cur = stack.pop();
//                stack.push(cur);
//                stack.push(null);
//
//
//                stack.push(cur.right);
//                stack.push(cur.left);
//            }else{
//                stack.pop();
//                TreeNode deal = stack.pop();
////                if (deal!=null){
//                    ans.add(deal.val);
//
////                }
//            }
//        }
//        return ans;
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right!=null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left!=null) st.push(node.left);    // 添加左节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
}
