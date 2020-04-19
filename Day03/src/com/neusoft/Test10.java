package com.neusoft;
import java.util.Random;

/**
 * @author Liu
 * @date 2020/4/19 18:03
 */
public class Test10 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5 ; i++) {
            int num = random.nextInt(10);
            System.out.println(num);

        }

    }
}
