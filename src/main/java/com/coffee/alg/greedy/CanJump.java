package com.coffee.alg.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CanJump {
    public static void main(String[] args) {
        CanJump canJump= new CanJump();
        boolean ans = canJump.canJumpV2(new int[]{2,0,0});
        System.out.println("result:"+ans);
        int ans2 = canJump.canJumpV3(new int[]{2,0,0});
        System.out.println("result:"+ans2);

    }

    public boolean canJump(int[] nums){
        if (nums.length <= 1){
            return true;
        }
        List<Integer> needJump =new ArrayList<>();
        needJump.add(0);
        return jump(nums,needJump);
    }

    public boolean jump(int[] nums,List<Integer> needJump){
        List<Integer> curNeedJump = new ArrayList<>();
        for (Integer i : needJump) {
            if (nums[i]+i+1>=nums.length){
                return true;
            }
            for (Integer integer = i; integer <= nums[i] ; integer++) {
                if (!needJump.contains(integer+i)){
                    curNeedJump.add(integer+i);
                    System.out.println(integer+i);
                }
            }
        }
        if (curNeedJump.isEmpty()){
            return false;
        }else {
            return jump(nums,curNeedJump);
        }



    }

    public boolean canJumpV2(int[] nums){
        int cover = 0;
        if (nums.length == 1) return true;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover,cover+nums[i]);
            if (cover >= nums.length-1){
                return true;
            }
        }
        return false;
    }

    /**
     * 使用最小步数到达终点，且数组一定可以到达终点
     * @param nums
     * @return
     */
    public int canJumpV3(int[] nums){
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        //记录跳跃的次数
        int count=0;
        //当前的覆盖最大区域
        int curDistance = 0;
        //最大的覆盖区域
        int maxDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            //在可覆盖区域内更新最大的覆盖区域
            maxDistance = Math.max(maxDistance,i+nums[i]);
            //说明当前一步，再跳一步就到达了末尾
            if (maxDistance>=nums.length-1){
                count++;
                break;
            }
            //走到当前覆盖的最大区域时，更新下一步可达的最大区域
            if (i==curDistance){
                curDistance = maxDistance;
                count++;
            }
        }
        return count;

    }
}
