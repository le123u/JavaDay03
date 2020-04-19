package com.neusoft;
// 导入包
import java.util.Random;

/**
 * @author Liu
 * @date 2020/4/19 16:53
 */
public class RandomDemo05 {
    public static void main(String[] args) {
        // 创建random对象
        Random random = new Random();
        // 调用随机数方法
        // 生成[0,num）0 ~ num之间任意整数 不包括num
        for (int i = 0; i <=10 ; i++) {
            int num = random.nextInt(10);
            System.out.println(num);
        }
        // 生成 0 - 1 之间的任意随机浮点数
        double v = random.nextDouble();
        System.out.println(v);
        // 生成概率均等的布尔值
        boolean b = random.nextBoolean();
        System.out.println(b);

    }
}
