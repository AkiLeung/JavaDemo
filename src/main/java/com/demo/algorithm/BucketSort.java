package com.demo.algorithm;

/**
 * @author Joseph.L
 * @date 2019-03-25
 * @description Bucket TestSort
 */
public class BucketSort {
    /**
     * 程序主方法入口
     */
    public static void main(String[] args) {
        //定义排序对象
        BucketSort sort = new BucketSort();
        //检查测试：设置数组
        int[] array = {5, 2, 1, 4, 6, 7, 3, 5, 8, 9, 6, 7, 2, 2, 1, 3};

        //执行桶排序后输出结果
        sort.bucketSort(array);

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
}
