package com.coffee.alg.hashmap;

public class CanConstruct {

    public static boolean canConstruct(String ransomNote, String magazine){
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[(int) magazine.charAt(i) - (int)'a'] = map[(int) magazine.charAt(i) - (int)'a'] ++;
        }


        // shortcut
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        // 定义一个哈希映射数组
        int[] record = new int[26];

        // 遍历
        for(char c : magazine.toCharArray()){
            record[c - 'a'] += 1;
        }

        for(char c : ransomNote.toCharArray()){
            record[c - 'a'] -= 1;
        }

        // 如果数组中存在负数，说明ransomNote字符串中存在magazine中没有的字符
        for(int i : record){
            if(i < 0){
                return false;
            }
        }

        return true;
    }


}
