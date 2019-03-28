package com.demo.algriothmn;

import com.demo.utility.RandomNumber;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Joseph.L
 * @date 2019-03-23
 * @description 10 大排序算法实现:从小到大
 * 01 泡沫排序 bubbleSort 2019-03-23
 * 02 桶排序   bucketSort 2019-03-25
 * 03 快速排序 quickSort  2019-03-25
 */
public class Sort {

    /**
     * 程序主方法入口
     */
    public static void main(String[] args) {
        //定义排序对象
        Sort sort = new Sort();
        //检查测试：设置数组
        int[] array = {5, 2, 1, 4, 6, 7, 3, 5, 8, 9, 6, 7, 2, 2, 1, 3};

        //压力测试：设定需要排序的数组 10W长度，随机分配数组内容
        //int length = 100000;
        //int[] array = new int[length];
        //for (int i = 0; i < length; i++) {
            // array[i] = RandomNumber.getRandom(1, length);
        //}

        //01执行泡沫排序后输出结果
        //sort.bubbleSort(array);
        //sort.displayArray("泡沫排序", array);

        //02执行桶排序后输出结果
        //sort.bucketSort(array);

        //03执行快速排序后输出结果
        sort.quickSort(array);
        sort.displayArray("快速排序", array);
    }

    /**
     * 03 快速排序
     * */
    public void quickSort(int[] array){

    }

    /**
     * 02 桶排序
     * 利用桶标记好数值的个数，按桶顺序打印其中的数据量
     * 时间复杂度:N + N + N * N
     */
    public void bucketSort(int[] array) {
        //查找数组中最大值
        int max = 0;
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        //以最大值设置桶编码
        int[] bucket = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }

        //输出桶排序结果
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > 0) {
                for (int j = 0; j < bucket[i]; j++) {
                    System.out.print(i + " ,");
                }
            }
        }
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
