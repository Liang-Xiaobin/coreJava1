package cn.edu.gdupt.basic.entity;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.10.14
 * @since JDK1.8
 */
public class Student {
    private Integer age;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
