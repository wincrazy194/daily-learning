package com.面向对象高级.继承.oopextendtest4;

public class Phone extends SmartDevice {
    @Override
    public double payment() {
        double payment = super.payment();
        payment= payment * 0.9;
        return payment;
    }

}
