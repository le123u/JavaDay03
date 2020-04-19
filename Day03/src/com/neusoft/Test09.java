package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 18:03
 */
public class Test09 {
    public static void main(String[] args) {
        // 打印 1 - 100质数（素数）
        int count = 0;
        int flag = 3;
        a: for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                    if (i % j == 0)  //不是质数
                        continue a;

            }
            System.out.print(i + (++count % flag == 0 ? "\n" : "\t") );
        }

    }
}

