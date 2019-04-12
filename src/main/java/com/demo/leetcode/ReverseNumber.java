package com.demo.leetcode;

/**
 * @author Joseph.L
 * @date 2019-04-12
 * @description 反正号码
 */
public class ReverseNumber {

    /**
     * 主程序入口
     */
    public static void main(String[] args) {
        int number = -4567;
        System.out.println("反转结果：" + solution1(number));
    }

    /**
     * 方法1
     */
    public static int solution1(int number) {
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
        return intReturn;
    }

}
