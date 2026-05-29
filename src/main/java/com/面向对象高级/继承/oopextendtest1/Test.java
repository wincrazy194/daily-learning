package com.面向对象高级.继承.oopextendtest1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "张三";
        s.age = 19;
        s.grade = "高三";

        System.out.println(s.name + "," + s.age + "," + s.grade);
        s.eat();
        s.study();
        Teacher t = new Teacher();
        t.name = "李四";
        t.age = 30;
        t.subject = "语文";
        System.out.println(t.name + "," + t.age + "," + t.subject);
        t.eat();
        t.teach();
    }
}
