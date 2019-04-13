package com.demo.leetcode;

/**
 * @author Joseph.L
 * @date 2019-04-13
 * @description 判断数字是否回文数
 */
public class PalindromeNumber {

    /**
     * 程序入口
     */
    public static void main(String[] args) {
        int number = 19;
        System.out.println("回文数：" + solution1(number));
    }

    /**
     * 方法1
     * 理论时间复杂度：N
     */
    public static boolean solution1(int number) {
        long startTime = System.currentTimeMillis();
        //负数肯定不是回文数
        if (number <= 0) {
            return false;
        }
        //反转数字
        boolean blReturn = false;
        int intTemp = 0;
        String strTemp = Integer.toString(number);
        String strNumber = "";
        for (int i = strTemp.length() - 1; i >= 0; i--) {
            strNumber += strTemp.charAt(i);
        }
        intTemp = Integer.parseInt(strNumber);
        if (number - intTemp == 0) {
            blReturn = true;
        }
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("方法1运行时间：" + runTime);
        return blReturn;
    }

}
