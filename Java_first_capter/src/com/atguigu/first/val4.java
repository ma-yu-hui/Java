package com.atguigu.first;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: val4    // 类名，会自动填充
 * @Author: MYH          // 创建者
 * @Date: 2022/9/18 21:44   // 时间
 * @Version: 1.0     // 版本
 */
public class val4 {
    public static void main(String[] args) {
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c+num+str);//107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hello
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a
        System.out.println("*   *");
        System.out.println('*'+"\t"+'*');
    }
}
