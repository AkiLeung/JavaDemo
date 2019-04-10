package com.demo.algorithm;

/**
 * @author Joseph.L
 * @date 2019-04-10
 * @description 创建斐波那契函数
 */
public class Fibonacci {

    /**
     * 主函数
     */
    public static void main(String[] args) {
        getFibonacci_01(50);
    }

    /**
     * 循环创建斐波那契函数
     * 1 1 2 3 5 8 13 ,即
     * 当第一位时，返回：1
     * 大于第一位是，Fn = F(n-2) + F(n-1)
     */
    public static void getFibonacci_01(long length) {
        //位数必须大于0
        if (length <= 0) {
            System.out.println("斐波那契函数，位数必须大于0");
            return;
        }
        System.out.println("数列：");
        if (length == 1) {
            System.out.println(length);
        } else {
            long     temp1 = 0, //对应F(n-2)
                    temp2 = 0, //对应F(n-1)
                    temp3 = 0; //对应F(n)
            temp1 = 0;
            temp2 = 1;
            System.out.println(1);
            for (int i = 2; i <= length; i++) {
                //实现公式 Fn = F(n-2) + F(n-1)
                temp3 = temp1 + temp2;
                System.out.println(temp3);
                temp1 = temp2;
                temp2 = temp3;
            }
        }
    }



}
