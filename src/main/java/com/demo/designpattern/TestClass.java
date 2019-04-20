package com.demo.designpattern;

/**
 * @author Joseph.L
 * @date 201-04-20
 * @description 测试
 */
public class TestClass {

    public static void main(String[] args) {

        /*饿汉模式*/
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        if (s1 == s2) {
            System.out.println("s1==s2");
        }

        /*懒汉模式*/
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        if (s3 == s4) {
            System.out.println("s3==s4");
        }
    }
}
