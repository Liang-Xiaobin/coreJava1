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

    private static void changeInt(int x, int y) {
        x = 9;
        y = 10;
    }

    private static void changeList(List<Student> a) {
        Student student = new Student();
        a.add(student);
    }

    private static void changeObj(Student student) {
        student = new Student();
        student.setName("liang");
    }

    private static void changeParam(Student student) {
        student.setName("liang");
        student.setAge(19);
    }

    private static void changeString(String s) {
        s = "zhang";
    }
}
