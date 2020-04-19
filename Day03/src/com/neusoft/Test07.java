package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 18:03
 */
public class Test07 {
    public static void main(String[] args) {
        // 倒三角
        for (int i = 5; i >= 0 ; i--) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
