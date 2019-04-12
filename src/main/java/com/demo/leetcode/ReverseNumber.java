package com.demo.leetcode;

/**
 * @author Joseph.L
 * @date 2019-04-12
 * @description 反转号码
 */
public class ReverseNumber {

    /**
     * 主程序入口
     */
    public static void main(String[] args) {
        int number = -405600;
        System.out.println("方法1，反转结果：" + solution1(number));
        System.out.println("方法2，反转结果：" + solution2(number));
    }

    /**
     * 方法1
     * 时间复杂度：N，但因为循环中使用了String，GC介入因此慢
     */
    public static int solution1(int number) {
        long startTime = System.currentTimeMillis();

        int intReturn = 0;
        double intMax = Math.pow(2, 31);
        double intMin = -Math.pow(2, 31);
        //校验
        if (number == 0) {
            return intReturn;
        }
        if (number > intMax || number < intMin) {
            return intReturn;
        }

        //反转数字
        String strTemp1 = "" + Math.abs(number);
        String strTemp2 = "";
        for (int i = strTemp1.length() - 1; i >= 0; i--) {
            strTemp2 = strTemp2 + strTemp1.charAt(i);
        }
        intReturn = Integer.parseInt(strTemp2);
        if (number < 0) {
            intReturn = intReturn * -1;
        }
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("方法1，运行时间：" + runTime);
        return intReturn;
    } 

    /**
     * 方法2
     * 时间复杂度：N*N,但因为避开循环中使用STRING，则避开使用GC介入，因此更快。
     */
    public static int solution2(int number) {
        long startTime = System.currentTimeMillis();

        int intReturn = 0;
        double intMax = Math.pow(2, 31);
        double intMin = -Math.pow(2, 31);
        //校验
        if (number == 0) {
            return intReturn;
        }
        if (number > intMax || number < intMin) {
            return intReturn;
        }

        String temp = "" + Math.abs(number);
        int size = temp.length();
        //反转数字
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt("" + temp.charAt(i));
        }

        for (int i = size - 1; i >= 0; i--) {
            intReturn += array[i] * Math.pow(10,i);
        }

        if (number < 0) {
            intReturn = intReturn * -1;
        }
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("方法2，运行时间：" + runTime);
        return intReturn;
    }
}
