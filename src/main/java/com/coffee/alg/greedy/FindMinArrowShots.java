package com.coffee.alg.greedy;

import java.util.Arrays;

public class FindMinArrowShots {
    public static void main(String[] args) {
        int[][] points1 = new int[][]{{1,2},{3,4},{5,6},{7,8}};
        int[][] points2 = new int[][]{{1,2},{2,3},{3,4},{4,5}};
        FindMinArrowShots findMinArrowShots = new FindMinArrowShots();
        int ans1 = findMinArrowShots.findMinArrowShots(points1);
        int ans2 = findMinArrowShots.findMinArrowShots(points2);
        System.out.println("ans1:"+ans1);
        System.out.println("ans2:"+ans2);
    }

    /**
     *
     * 在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
     *
     * 一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
     *
     * 给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球所必须射出的最小弓箭数。
     *
     * 示例 1：
     *
     * 输入：points = [[10,16],[2,8],[1,6],[7,12]]
     * 输出：2
     * 解释：对于该样例，x = 6 可以射爆 [2,8],[1,6] 两个气球，以及 x = 11 射爆另外两个气球
     * @param points
     * @return
     */
    public int findMinArrowShots(int[][] points) {
        int shot = 1;
        Arrays.sort(points, (a, b) -> {
            return a[0] - b[0];
        });
        int[] oneShot = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        for (int[] point : points) {
            if ((oneShot[0] <=point[0] && point[0] <= oneShot[1])
                    || (oneShot[0]>= point[1] && point[1] >= oneShot[0])) {
                oneShot[0] = Math.max(oneShot[0], point[0]);
                oneShot[1] = Math.min(oneShot[1], point[1]);
            } else {
                oneShot = new int[]{point[0], point[1]};
                shot++;
            }

        }
        return shot;

    }

    public int findMinArrowShotsV2(int[][] points) {
        // 根据气球直径的开始坐标从小到大排序
        // 使用Integer内置比较方法，不会溢出
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1;  // points 不为空至少需要一支箭
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {  // 气球i和气球i-1不挨着，注意这里不是>=
                count++; // 需要一支箭
            } else {  // 气球i和气球i-1挨着
                points[i][1] = Math.min(points[i][1], points[i - 1][1]); // 更新重叠气球最小右边界
            }
        }
        return count;
    }
}
