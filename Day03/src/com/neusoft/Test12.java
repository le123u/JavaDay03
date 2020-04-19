package com.neusoft;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/19 18:03
 */

public class Test12 {
    public static void main(String[] args) {
        // 猜数字


        Random random = new Random();
        int j = random.nextInt(100) + 1;
        while(true){
            System.out.println("请输入你猜的数字");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();


            if (j > num)
                System.out.println("猜大了");

            else if (j < num)
                System.out.println("猜小了");

            else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
