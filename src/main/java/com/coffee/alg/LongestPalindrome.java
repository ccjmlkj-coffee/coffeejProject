package com.coffee.alg;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaaa"));
    }

    public static String longestPalindrome(String s) {
        String ans = "";
        int index = 0;
        int maxI = s.length() -1;
        while (index<s.length()){
            char[] arr = s.toCharArray();
            int b = index-1,e;
            if (index < arr.length-1 && arr[index] == arr[index+1]){

                e =index +2;
                String now = s.substring(index,index+2);
                if (now.length() > ans.length()){
                    ans=now;
                }

                while (b>=0 && e< arr.length){
                    if (arr[b] == arr[e]){
                        String tmpAns = s.substring(b,e+1);
                        if (tmpAns.length() > ans.length()){
                            ans = tmpAns;
                        }
                        b--;
                        e++;
                    }else{
                        break;
                    }
                }
            }
            e = index+1;


            while (b>=0 && e< arr.length){
                if (arr[b] == arr[e]){
                    String tmpAns = s.substring(b,e+1);
                    if (tmpAns.length() > ans.length()){
                        ans = tmpAns;
                    }
                    b--;
                    e++;
                }else{
                    break;
                }
            }
            index++;
        }

        if (ans.isEmpty()){
            return s.substring(0,1);
        }
        return ans;
    }
}
