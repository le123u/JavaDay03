package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 19:36
 */
public class BerakAndContinueDemo13 {
    public static void main(String[] args) {
        // 带有标识的break和continue
        A: for (int i = 1; i <=5 ; i++) {
            B: for (int j = 1; j <=5 ; j++) {
                 if (j == 3)
                    break A;
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}
