package com.面向对象高级.继承.oopextendtest3;

public class ThirdGenerationPhone extends SecondGenerationPhone {
    public void playGame() {
        System.out.println("利用手机玩游戏");
    }
    // 注解
    // 给编译器的提示，告诉编译器这是一个重写的方法
    @Override
    public void call() {
        System.out.println("开启视频通话");
        System.out.println("利用手机打电话");
    }

}
