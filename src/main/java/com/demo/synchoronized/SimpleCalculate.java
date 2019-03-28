package com.demo.synchoronized;

/**
 * @author Joseph.L
 * @date 2019-03-05
 * @description 測試多線程高並發
 */
public class SimpleCalculate implements Runnable {
    /**
     * 創建兩個實例用於操作同一個對象
     * 但，無論使用一個實例還是多個實例都對同一個靜態變量操作高並發時計算仍會出錯
     */
    static SimpleCalculate instance1 = new SimpleCalculate();
    static SimpleCalculate instance2 = new SimpleCalculate();

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
        t1.start();       t2.start();
        //2線程同時結束
        t1.join();        t2.join();
        System.out.println(iCount);
    }

    /**線程默認執行方法
     * */
    public void run() {
        for (int i = 0; i < iTimes; i++) {
            iCount++;
        }
    }
}
