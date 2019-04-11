package com.demo.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Joseph.L
 * @date 2019-04-11
 * @description 计算数组中两个数之和
 */
public class TwoSum {

    /**
     * 程序主方法
     */
    public static void main(String[] args) {
        int[] array = {2, 11,3,4, 7,15};
        int target = 9;
        solution1(array, target);
        solution2(array, target);
        solution3(array, target);
    }

    /**
     * 解法01
     */
    public static void solution1(int[] array, int target) {
        long startTime = System.currentTimeMillis();
        boolean stop = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (target == array[i] + array[j]) {
                    System.out.println("[" + i + "," + j + "]");
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("方法1：时间复杂度：N*N；耗时：" + runTime);
    }

    /**
     * 解法2
     */
    public static void solution2(int[] array, int target) {
        long startTime = System.currentTimeMillis();

        Map<Integer, Integer> map = new HashMap<>(array.length);
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                System.out.println("[" + i + "," + map.get(complement) + "]");
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("方法2：时间复杂度：2*N；耗时：" + runTime);
    }

    /**
     * 解法3
     */
    public static void solution3(int[] array, int target) {
        long startTime = System.currentTimeMillis();

        Map<Integer, Integer> map = new HashMap<>(array.length);

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                System.out.println("[" +map.get(complement)  + "," + i + "]");
                break;
            } else {
                map.put(array[i], i);
            }
        }

        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("方法3：时间复杂度：N；耗时：" + runTime);
    }
}
