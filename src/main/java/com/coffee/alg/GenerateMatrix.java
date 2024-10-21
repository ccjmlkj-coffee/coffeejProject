package com.coffee.alg;

public class GenerateMatrix {

    public static void main(String[] args) {
        int[][] r = generateMatrix(9);
        System.out.println("=====");
    }

    public static int[][] generateMatrix(int n){
        int times = n/2;
        int result[][] = new int[n][n];
        int i=0,j=0;
        int drawLen =n;
        int count = 1;
        int now = 1;
        while(times >0){
            //先画最上面
            for (int a= i;a<drawLen-1;a++){
                result[i][j] = count++;
                i++;
            }
            for (int b=j ; b<drawLen-1;b++){
                result[i][j]=count++;
                j++;
            }
            for (int c = i;c>now-1;c--){
                result[i][j] = count++;
                i--;
            }
            for (int d=j;d>now-1;d--){
                result[i][j] = count++;
                j--;
            }
            drawLen--;
            times--;
            i = now;
            j = now;
            now ++;
        }
        if (n%2 == 1){
            result[n/2][n/2]=count;
        }
        return result;
    }
}
