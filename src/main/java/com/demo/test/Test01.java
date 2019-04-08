package com.demo.test;

import java.util.Date;

/**
 * @author Joseph.L
 * @date 2019-04-03
 * @description 循环100次，每次停止一秒，打印出时间
 */
public class Test01 {

    /**
     * ceshi
     */
    private String string_test = "";

    public String getString() {
        String aa = "132";

        int time = 100;
        klk123(time);

        System.out.println(aa);
        return aa;
    }

    private void klk123(int time) {
        for (int i = 0; i < time; i++) {

        }
    }



    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Date date = new Date();
            System.out.println(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
