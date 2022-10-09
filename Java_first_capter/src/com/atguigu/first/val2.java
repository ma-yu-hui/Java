package com.atguigu.first;

/**
 * @Description: // 类说明，在创建类时要填写
 * @ClassName: val2    // 类名，会自动填充
 * @Author: MYH           // 创建者
 * @Date: 2022/9/15 21:33   // 时间
 * @Version: 1.0     // 版本
 */
public class val2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 10 ; j++) {
                if (j % 4 == 0){
                    return;
                }
                System.out.print(j);
            }
            System.out.println("myh");
        }
    }
}
