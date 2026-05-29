package com.面向对象高级.继承.oopextendtest3;

public class Test {
    public static void main(String[] args) {
        FirstGenerationPhone f1 = new FirstGenerationPhone();
        f1.call();
        System.out.println("-----------------------------");
        SecondGenerationPhone s2 = new SecondGenerationPhone();
        s2.call(); 
        s2.sendMessage();
        System.out.println("-----------------------------");
        ThirdGenerationPhone t3 = new ThirdGenerationPhone();
        t3.call();
        t3.sendMessage();
        t3.playGame();
    }

}
