package com.demo.efficiency;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph.L
 * @date 2019-04-04
 * @description Garbage Collection
 */
public class GarbageCollection {

    /**
     * 主方法
     */
    public static void main(String[] args) {
        GarbageCollection gcDemo = new GarbageCollection();
        gcDemo.method_1();
        gcDemo.method_2();
    }

    /**
     * 方法一
     */
    public void method_1() {
        long time1 = System.currentTimeMillis();
        int length = 15000000;
        String[] storage = new String[length];
        for (int i = 0; i < length; i++) {
            storage[i] = "" + i;
        }
        long time2 = System.currentTimeMillis();
        long usedTime = time2 - time1;
        System.out.println("方法1耗时：" + usedTime);
    }

    /**
     * 方法二
     */
    public void method_2() {
        long time1 = System.currentTimeMillis();
        int length = 15000000;
        int[] storage = new int[length];
        for (int i = 0; i < length; i++) {
            storage[i] = i;
        }
        long time2 = System.currentTimeMillis();
        long usedTime = time2 - time1;
        System.out.println("方法2耗时：" + usedTime);
    }
}
