package com.demo.algorithm;

/**
 * @author Joseph.L
 * @date 2019-03-23
 * @description Bubble TestSort
 */
public class BubbleSort {

    /**
     * 程序主方法入口
     */
    public static void main(String[] args) {
        //定义排序对象
        BubbleSort sort = new BubbleSort();
        //检查测试：设置数组
        int[] array = {5, 2, 1, 4, 6, 7, 3, 5, 8, 9, 6, 7, 2, 2, 1, 3};

        //执行泡沫排序后输出结果
        sort.bubbleSort(array);
        sort.displayArray("泡沫排序", array);

    }

    /**
     * 01 泡沫排序
     * 利用数组前后比较，嵌套循环把最大的数据往后移动
     * 时间复杂度:N * N
     */
    public void bubbleSort(int[] array) {
        long time1 = System.currentTimeMillis();
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        long time2 = System.currentTimeMillis();
        long userTime = time2 - time1;
        System.out.println("结束执行时间：" + userTime);
    }

    /**
     * 打印数组
     */
    public void displayArray(String sortName, int[] array) {
        System.out.println("执行：" + sortName + "的结果。");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + String.format("%04d", i) + "]:" + array[i]);
        }
    }
}
