package cn.edu.gdupt.lambda.main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 * <p>
 * 1.举例(o1,o2) -> Integer.compare(o1,o2);
 * 2.格式:
 * -> :lambda操作符或者箭头操作符
 * -> :左边:lambda形参列表 (其实就是接口中抽象方法的形参列表)
 * -> : 右边:lambda体(其实就是重写抽象方法的方法体)
 * 3.lambda表达式的使用: (分为6种情况)
 * 4.lambda表达式的本质:作为接口的实例
 * <p>
 * 总结：
 * ->左边：lambda形参列表的参数类型可以省略(类型推断)，如果lambda形参列表只有一个参数，其一对（）也可以省略
 * ->右边：lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句),可以省略一对{}和return关键字
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.10.16
 * @since JDK1.8
 */
public class LambdaTest2 {
    /**
     * 语法格式一：无参，无返回值
     */
    @Test
    public void test() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world!!!!");
            }
        };
        r1.run();
        System.out.println("*************************************");
        Runnable r2 = () -> System.out.println("hello world!!!!");
        r2.run();
        System.out.println("***************************************");
    }

    /**
     * 语法格式二：lambda需要一个参数，但是没有返回值
     */
    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("hello world");
        System.out.println("****************************");
        Consumer<String> con1 = (s) -> System.out.println(s);
        con1.accept("hello world");
    }

    /**
     * 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为类型推断
     */
    @Test
    public void test3() {
        Consumer<String> con1 = (s) -> System.out.println(s);
        con1.accept("hello world");
    }

    @Test
    public void test4() {
        //类型推断
        ArrayList<String> list = new ArrayList<>();
        int[] arr = {1, 2, 3};
    }

    /**
     * 语法格式四：lambda若只需要一个参数时，参数的小括号可以省略
     */
    @Test
    public void test5() {
        Consumer<String> con1 = s -> System.out.println(s);
        con1.accept("hello");
    }

    /**
     * 语法格式五：lambda需要两个或者以上的参数，多条执行语句，并且可以有返回值
     */
    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com1.compare(12, 21));
        System.out.println("***************************");
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12, 21));
    }

    /**
     * 语法格式六：当lambda体只有一条语句时，return若与大括号有，都可以省略
     */
    @Test
    public void test7() {
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12, 21));
    }
}
