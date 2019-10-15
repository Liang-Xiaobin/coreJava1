package cn.edu.gdupt.lambda.main;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.10.15
 * @since JDK1.8
 */
public class Test2_2 {
    public static void main(String[] args) {
        Runnable noArguments = () -> System.out.println("hello world");
        ActionListener onArgument = envent -> System.out.println("button clicked");
        Runnable multiStatement = () -> {
            System.out.println("hello");
            System.out.println("world");
        };
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }
}
