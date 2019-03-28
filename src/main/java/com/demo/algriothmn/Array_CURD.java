package com.demo.algriothmn;

/**
 * @author Joseph.L
 * @date 2019-03-21
 * @description 算法：数组增删查改
 */
public class Array_CURD {

    public static void main(String[] args) {
        // 数组大小
        int size = 10;
        // 定义数组
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //新增：随机数 1~100
//       for (int i = 0; i < size; i++) {
//            array[i] = RandomNumber.getRandom(1, 100);
//        }

        //查询
//        int search = 11;
//        boolean blFind = false;
//        //查询：6
//        for(int i = 0;i < size;i++){
//            if(search == array[i]){
//                blFind = true;
//                break;
//            }
//        }
//        if(blFind){
//            System.out.println("查找到："+search);
//        }else{
//            System.out.println("查找不到："+search);
//        }

        // 修改
//        int update = 12;
//        int search = 6;
//        for (int i = 0; i < size; i++) {
//            if (search == array[i]) {
//                array[i] = update;
//                break;
//            }
//        }

        //删除
        int delete = 11 - 1;
        for (int i = 0; i < size; i++) {
            if (delete == array[i]) {
                for (int j = i + 1; j < size; j++) {
                    if (j < size) {
                        array[j - 1] = array[j];
                    }
                }
                array[size - 1] = 0;
                break;
            }
        }

        //输出数据内容
        for (int i = 0; i < size; i++) {
            System.out.println("array[" + i + "]:" + array[i]);
        }
    }
}
