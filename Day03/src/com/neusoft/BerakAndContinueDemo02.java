package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 16:06
 */
public class BerakAndContinueDemo02 {
    // continue 入门案例 打印1-10之间所有不是3倍数整数
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            // 判断是否是3的倍数
            if (i % 3 == 0)
                continue;

            //如果不是3的倍数打印
            System.out.println(i);

        }

    }
}