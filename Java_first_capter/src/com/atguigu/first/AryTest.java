package com.atguigu.first;

import java.util.Scanner;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: AryTest    // 类名，会自动填充
 * @Author: MYH          // 创建者
 * @Date: 2022/9/23 20:28   // 时间
 * @Version: 1.0     // 版本
 */
public class AryTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"×"+j +"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}