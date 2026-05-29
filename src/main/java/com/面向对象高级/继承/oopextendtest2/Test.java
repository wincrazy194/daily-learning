package com.面向对象高级.继承.oopextendtest2;

public class Test {
    public static void main(String[] args) {
        
        // 创建安卓手机对象
        Android a = new Android();
        a.brand = "华为";
        a.price = 4999.99;
        System.out.println(a.brand + "," + a.price);
        a.call();
        a.NFC();

        // 创建苹果手机对象
        IOS i = new IOS();
        i.brand = "苹果";
        i.price = 9999.99;
        System.out.println(i.brand + "," + i.price);
        i.call();

        // 创建笔记本电脑对象
        Laptop l = new Laptop();
        l.brand = "联想";
        l.price = 5999.99;
        System.out.println(l.brand + "," + l.price);
        l.coding();
    }
}
