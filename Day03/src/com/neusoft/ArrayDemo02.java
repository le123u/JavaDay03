package com.neusoft;

import java.util.Random;

/**
 * @author Liu
 * @date 2020/4/19 20:35
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
      // 求数组中最大的值
        Random random = new Random();
        // 创建一个12个元素的随机数组，值在1 -100 之间
        int[] arr = new int[12];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print( arr[i] + "\t");
        }
        // 求arr种最大值
        // 1. 定义最大值变量，假设是第一个
        int max = arr[0];
        // 2.遍历取出 ，如果比第一个大 更新最大值 不比她大继续比较i
        for (int i = 0; i < 12 ; i++) {
            if(arr[i] < max)
                System.out.println("最大值"+ max);
                
            else {
                max = arr[i];
                System.out.println("最大值"+ arr[i]);
                break;
            }

        }

    }
}
