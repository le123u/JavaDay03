package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 16:33
 */

// 打印一天内所有的格式
    //格式： 12时48分
public class ForForDemo04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 24 ; i++) {
            for (int j = 0; j <= 59 ; j++) {
                System.out.print(i + "时" + j + "分\t");

            }
            System.out.println();

        }
    }
}
