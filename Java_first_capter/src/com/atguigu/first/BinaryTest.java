package com.atguigu.first;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: BinaryTest    // 类名，会自动填充
 * @Author: MYH          // 创建者
 * @Date: 2022/9/20 21:55   // 时间
 * @Version: 1.0     // 版本
 */
public class BinaryTest {
    public static void main(String[] args) {
        int num1 = 0b111001; //二进制以0b开头
        int num2 = 5468546; //十进制
        int num3 = 016515; //八进制以0开头
        int num4 = 0x68756ABC; //十六进制以0x开头
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        System.out.println("num3:"+num3);
        System.out.println("num4:"+num4);
    }
}
