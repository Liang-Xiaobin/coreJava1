package cn.edu.gdupt.lambda.main;

import java.util.Comparator;

/**
 * lambda表达式使用
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.10.16
 * @since JDK1.8
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world!!!!");
            }
        };
        r1.run();
        System.out.println("*************************************");
        Runnable r2 = () -> System.out.println("hello world!!!!");
        System.out.println("***************************************");
        r2.run();
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int i = com1.compare(12, 21);
        System.out.println("**********************************");
        System.out.println(i);
        System.out.println("***************************************");
        //Lambda表达式的写法
        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println("***************************");
        int j = com2.compare(12, 21);
        System.out.println(j);
        System.out.println("*************************");
        //方法引用
        Comparator<Integer> com3 = Integer::compare;
        int compare3 = com3.compare(32, 21);
        System.out.println(compare3);
        System.out.println("***************************");
    }
}
