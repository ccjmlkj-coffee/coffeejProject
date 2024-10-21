package com.coffee.alg.hashmap;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("rat", "atrcs"));
    }

    public static boolean isAnagram(String s,String t){
        boolean ans = true;
        int[] sDic = new int[26];
        int[] tDic = new int[26];
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        for (char c : charsS) {
            sDic[(int)c-(int)'a'] = sDic[(int)c-(int)'a']+1;
        }
        for (char c : charsT) {
            tDic[(int)c-(int)'a'] = tDic[(int)c-(int)'a']+1;
        }
        for (int i = 0; i < 26; i++) {
            if (tDic[i]!=sDic[i]){
                ans=false;
            }
        }
        return ans;
    }
}
