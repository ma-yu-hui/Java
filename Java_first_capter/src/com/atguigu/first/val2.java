package com.atguigu.first;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: val2    // 类名，会自动填充
 * @Author: MYH          // 创建者
 * @Date: 2022/9/15 21:33   // 时间
 * @Version: 1.0     // 版本
 */
public class val2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
