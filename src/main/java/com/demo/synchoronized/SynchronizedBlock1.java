package com.demo.synchoronized;

/**
 * @author Joseph.L
 * @date 2019-03-04
 * @description 測試Synchronized塊線程安全
 */
public class SynchronizedBlock1 implements Runnable {
    /**
     * 創建兩個實例用於操作同一個對象
     */
    static SynchronizedBlock1 instance1 = new SynchronizedBlock1();
    static SynchronizedBlock1 instance2 = new SynchronizedBlock1();

    /**
     * 統計用變量
     */
    static int iCount = 0;
    /**
     * 循環類型越大計算出錯幾率越高
     */
    static int iTimes = 100000;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        //2線程同時執行
        t1.start();
        t2.start();
        //2線程同時結束
        t1.join();
        t2.join();
        System.out.println(iCount);
    }


    /**
     * 線程默認執行方法
     */
    public void run() {
        synchronized (SynchronizedBlock1.class) {
            for (int i = 0; i < iTimes; i++) {
                iCount++;
            }
        }
    }
}
