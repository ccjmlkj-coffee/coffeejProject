package com.coffee.alg.greedy;

import java.util.Arrays;
import java.util.LinkedList;

public class ReconstructQueue {
    public static void main(String[] args) {
        ReconstructQueue reconstructQueue = new ReconstructQueue();
        int[][] people = new int[][]{new int[]{6,0},new int[]{5,0},new int[]{4,0},{3,2},{2,2},{1,4}};
        int[][] result = reconstructQueue.reconstructQueue(people);
        System.out.println("result:"+result);
        for (int[] ints : result) {
            String item="";
            for (int anInt : ints) {
                item+=(anInt+",");
            }
            System.out.println(item);

        }
    }

    public int[][] reconstructQueue(int[][] people){
        Arrays.stream(people).sorted((a,b)->{
            if (a[0] == b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        LinkedList<int []> que = new LinkedList<>();
        for (int[] person : people) {
            que.add(person[1],person);
        }
        return que.toArray(new int[people.length][]);
    }
}
