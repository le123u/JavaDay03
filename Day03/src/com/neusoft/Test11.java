package com.neusoft;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Liu
 * @date 2020/4/19 18:03
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String name = scanner.nextLine();


       // System.out.println("你上辈子的职业可能是 0：宰相 1：一品带刀侍卫 2：皇帝 3：大内总管 4：店小二 5：江湖郎中");
        Random random = new Random();
        int num = random.nextInt(6);
        String zhiye = "";
        switch(num) {
            case 0 :
                zhiye = "宰相";
                break;
            case 1 :
                zhiye = "一品带刀侍卫";
                break;
            case 2 :
                zhiye = "皇帝";
                break;
            case 3 :
                zhiye = "大内总管";
                break;
            case 4 :
                zhiye = "店小二";
                break;
            case 5 :
                zhiye = "江湖郎中";
                break;
            default:
                System.out.println("江湖郎中");
                break;

        }
        System.out.println("您好"+name+"经过大数据分析你上辈子的职业是："+zhiye);



    }
}
