package com.coffee.alg.string;

public class ReverseString {

    public static void main(String[] args) {
        char[] chars = {'h','e','l','s','l','o'};
        reverseString(chars);
        int as = chars[0] ^ chars[5];
        System.out.println(chars[0] ^ chars[5]);

        System.out.println(reverseString("abcdefg",2));
//        System.out.println(chars.toString());

        System.out.println('9' - '0');
        System.out.println((int) '9');
        System.out.println((int) '0');

    }

    public static void reverseString(char[] str){
        int left = 0;
        int right = str.length-1;
        while (left < right){
            char tmp = str[right];
            str[right] = str[left];
            str[left] = tmp;
            left++;right--;
        }
    }

    /**
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起, 每计数至 2k 个字符，就反转这 2k 个字符中的前 k 个字符。
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     * @param s
     * @param k
     */
    public static String reverseString(String s,int k){
        StringBuilder sb = new StringBuilder();
        int r = 2*k;
        for (int l = 0;l<s.length();l+=(2*k)){
            String reStr =  s.substring(l,Math.min(l+k,s.length()));
            char[] reChars = reStr.toCharArray();
            reverseString(reChars);
            System.out.println(reChars);
            for (char reChar : reChars) {
                sb.append(reChar);
            }
            for (int c=l+k;c<Math.min(r,s.length());c++){
                sb.append(s.charAt(c));
            }

            r+=(2*k);
        }
        return sb.toString();
    }
}
