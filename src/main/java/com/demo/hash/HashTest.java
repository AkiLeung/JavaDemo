package com.demo.hash;

/**
 * @author Joseph.L
 * @date 2019-03-29
 * @description Test Hash Function
 */
public class HashTest {

    /**
     * 主程序入口
     */
    public static void main(String[] args) {
        test01();
    }

    /**
     * 测试一
     * */
    public static void test01() {
        String strTemp1 = "Aa";
        String strTemp2 = "BB";
        System.out.println(strTemp1.hashCode());
        System.out.println(strTemp2.hashCode());
        if (strTemp1.hashCode() == strTemp2.hashCode() && strTemp1 == strTemp2) {
            System.out.println("变量相等");
        } else {
            System.out.println("变量不等");
        }
    }



}
