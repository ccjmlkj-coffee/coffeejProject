package com.coffee.alg.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Partition {
   public List<List<String>> result = new ArrayList<>();
   public LinkedList<String> item = new LinkedList<>();

   public List<List<String>> partition(String str){
      backtracking(str,0);
      return result;
   }

   public void backtracking(String str,int startIndex){
      if (startIndex>=str.length()){
         result.add(new ArrayList<>(item));
         return;
      }
      for (int i = startIndex;i<str.length();i++){
         //如果当前字符串是回文，则加入item,不是的话则判断下一个
         if (isPalindrome(str.substring(startIndex,i+1).toCharArray())){
            item.add(str.substring(startIndex,i+1));
         }else {
            continue;
         }
         backtracking(str,i+1);
         item.removeLast();
      }
   }


   public boolean isPalindrome(char[] str){
      int s = 0;
      int e = str.length-1;
      while (s <= e){
         if (str[s]!=str[e]){
            return false;
         }
         e--;
         s++;
      }
      return true;
   }

   public static void main(String[] args) {
      String str = "aabcc";
      Partition partition = new Partition();
      List<List<String>> result=partition.partition(str);
      System.out.println(result);
      System.out.println(str.substring(0, 3));
   }
}
