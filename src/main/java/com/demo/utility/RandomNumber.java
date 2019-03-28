package com.demo.utility;

/**
 * @author Joseph.L
 * @date 2019-03-14
 * @description 生成指定范围的随机数
 */
public class RandomNumber {

    public static void main(String[] args) {
        int number = getRandom(1, 350);
        System.out.println("1~350 的随机数：" + number);
    }

    /**
     * 生成指定范围的随机数
     */
    public static int getRandom(int _min, int _max) {
        double value = (java.lang.Math.random() * (_max - _min)) + _min;
        int returnValue = (int) value;
        if (value - returnValue > 0.5) {
            returnValue++;
        }
        return returnValue;
    }
}
