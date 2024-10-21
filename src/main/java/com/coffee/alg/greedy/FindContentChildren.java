package com.coffee.alg.greedy;

import java.util.Arrays;

public class FindContentChildren {

    public static void main(String[] args) {
        FindContentChildren findContentChildren = new FindContentChildren();
        System.out.println(findContentChildren.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1,3,3}));
    }

    /**
     * 两种遍历方式，如果从胃口小到胃口大的，for循环遍历饼干
     *             如果从胃口大到胃口小的，for循环遍历胃口
     * @param g 胃口
     * @param s 饼干
     * @return
     */
    public int findContentChildren(int[] g,int[] s){
        int result = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int sIndex = 0;
        for (int j : s) {
            if (j <= g[sIndex]) {
                sIndex++;
                result++;
            }
            if (sIndex>=g.length){
                break;
            }
        }
        return result;
    }
}
