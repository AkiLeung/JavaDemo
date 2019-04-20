package com.demo.designpattern;

/**
 * @author Joseph.L
 * @date 2019-04-20
 * @description 单利模式
 * 应用场景：有些对象有且只有一个就足够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 * 区别：饿汉模式的特点是加载类的时候比较慢，但运行时获取对象的速度比较快，线程安全。
 *       懒汉模式的特点是加载类的时候比较快，但运行时获取对象的速度比较慢，线程不安全。
 */
public class Singleton1 {

    /**
     * 1.讲钩子函数私有化，不允许外部直接创建对象
     */
    private Singleton1() {
    }

    /**
     * 2.创建类的实例，唯一实例，使用private static修饰
     * 饿汉模式：类加载的时候就加载，希望尽快吃进内存中
     */
    private static Singleton1 instance = new Singleton1();

    /**
     * 3.提供一个获取实例的方法，使用public static修饰
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
