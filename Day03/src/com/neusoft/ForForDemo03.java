package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 16:33
 */
public class ForForDemo03 {
    public static void main(String[] args) {
        // for 循环有时候会使用嵌套
        // 不使用嵌套打印2020-1 -- 2023-12所有月份
        // xxxx年xx月

        // 控制年
        for (int i = 2020; i <= 2023; i++) {
            // 控制月
            for (int j = 1; j <=12 ; j++) {
                System.out.print(i + "年" + j + "月\t");

            }
            System.out.println();

        }
    }
}
