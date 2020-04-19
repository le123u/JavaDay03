package com.neusoft;

/**
 * @author Liu
 * @date 2020/4/19 16:06
 */
// break 跳出本层循环
// continue 用来结束本次循环，进行下一次循环
public class BerakAndContinueDemo01 {
    // break 入门案例 打印十次hello world 当打印第六次时 结束循环
    public static void main(String[] args) {
        System.out.println("start");
        // 定义10次循环
        for(int i = 1;i <= 10 ; i++){
            // 判断 i = 6 结束循环
            if(i == 6)
                break;
            System.out.println("hello world" + i);
        }
        System.out.println("end");

    }
}