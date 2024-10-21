package com.coffee.alg.backtrack;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        RestoreIpAddresses restoreIpAddresses = new RestoreIpAddresses();
        List<String> ans = restoreIpAddresses.restoreIpAddresses("2552552552551");
        System.out.println(ans);
    }

    public List<String> restoreIpAddresses(String str){
        //剪枝操作
        try {
            Long.parseLong(str);
        }catch (Exception e){
            return  result;
        }
        backtrack(str,0);
        return result;
    }

    public void backtrack(String str,int index){
        String curStr = sb.toString();
        if (curStr.split("\\.").length == 4 && str.length() <= index){
            result.add(curStr);
            return;
        }
        for (int i=index;i<str.length();i++){
            int dotIndex = sb.length();
            if (isValid(str.substring(index,i+1))){
                dotIndex = sb.length();
                if (sb.length()==0){
                    sb.append(str, index, i+1);
                }else {
                    sb.append(".").append(str, index, i+1);
                }
            }else {
                continue;
            }
            backtrack(str,i+1);
            sb.delete(dotIndex,sb.length());
        }
    }

    public boolean isValid(String str){
        if (str.length()>3){
            return false;
        }
        int iVal;
        try {
            iVal = Integer.parseInt(str);
        }catch (Exception e){
            return false;
        }
        if (str.charAt(0) == '0' && str.length()>1){
            return false;
        }
        if (iVal >255 || iVal < 0){
            return false;
        }
        return true;
    }
}
