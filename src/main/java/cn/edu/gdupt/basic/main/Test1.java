package cn.edu.gdupt.basic.main;

import cn.edu.gdupt.basic.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试Java中不同传参对原来值的影响
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.10.14
 * @since JDK1.8
 */
public class Test1 {
    public static void main(String[] args) {
        int x = 19;
        int y = 29;
        changeInt(x, y);
        System.out.println("x=" + x + "y=" + y);
        List<Student> k = new ArrayList<>();
        System.out.println(k.size());
        changeList(k);
        System.out.println(k.size());
        Student student = new Student();
        student.setName("张");
        System.out.println(student);
        changeObj(student);
        System.out.println(student);
        changeParam(student);
        System.out.println(student);
        String s = "yuanmeiqiu";
        changeString(s);
        System.out.println(s);
    }

    /**
     * 改变基本数据类型值
     *
     * @param x
     * @param y
     */
    private static void changeInt(int x, int y) {
        x = 9;
        y = 10;
    }

    /**
     * 改变集合类型值
     *
     * @param a
     */
    private static void changeList(List<Student> a) {
        Student student = new Student();
        a.add(student);
    }

    /**
     * 更改参数对象指向的引用
     *
     * @param student
     */
    private static void changeObj(Student student) {
        student = new Student();
        student.setName("liang");
    }

    /**
     * 更改参数对象的属性值
     *
     * @param student
     */
    private static void changeParam(Student student) {
        student.setName("liang");
        student.setAge(19);
    }

    /**
     * 更改参数字符串的值
     *
     * @param s
     */
    private static void changeString(String s) {
        s = "zhang";
    }
}
