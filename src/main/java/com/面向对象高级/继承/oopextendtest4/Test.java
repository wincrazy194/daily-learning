package com.面向对象高级.继承.oopextendtest4;

public class Test {
    //private static final 方法不能被重写
    //子类访问权限必须大于父类
    //建议子类重写方法申明和父类保持一致
    //查看三个子类对象，计算结果
    public static void main(String[] args) {
        Phone p = new Phone();
        p.name = "华为手机";
        p.price = 5000;
        double payment = p.payment();
        System.out.println(payment);
        System.out.println("-----------------------------");
        Laptop l = new Laptop();
        l.name = "华为笔记本";
        l.price = 17000;
        double payment1 = l.payment();
        System.out.println(payment1);
        System.out.println("-----------------------------");
        PAD pad = new PAD();
        pad.name = "华为平板";
        pad.price = 3000;
        double payment2 = pad.payment();
        System.out.println(payment2);
        System.out.println("-----------------------------");
    }

}
