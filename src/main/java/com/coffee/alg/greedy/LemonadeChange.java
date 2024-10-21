package com.coffee.alg.greedy;

public class LemonadeChange {

    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();
        boolean ans1  = lemonadeChange.lemonadeChange(new int[]{5,5,5,10,20});
        boolean ans2  = lemonadeChange.lemonadeChange(new int[]{5,5,10});
        boolean ans3  = lemonadeChange.lemonadeChange(new int[]{10,10});
        boolean ans4  = lemonadeChange.lemonadeChange(new int[]{5,5,5,10,10,20});
        System.out.println("result:"+ans1);
        System.out.println("result:"+ans2);
        System.out.println("result:"+ans3);
        System.out.println("result:"+ans4);
    }


    public boolean lemonadeChange(int[] bills){
        int fiveCast = 0;
        int tenCast = 0;
        for (int bill : bills) {
            if (bill==5){
                fiveCast+=5;
            }
            if (bill==10){
                tenCast+=10;
                if (fiveCast<5){
                    return false;
                }
                fiveCast = fiveCast-5;
            }
            if (bill==20){
                if (fiveCast<5 || (fiveCast+tenCast)<15){
                    return false;
                }else{
                    if (tenCast >=10){
                        tenCast-=10;
                        fiveCast-=5;
                    }else {
                        fiveCast-=15;
                    }
                }
            }
        }

        return true;
    }
}
