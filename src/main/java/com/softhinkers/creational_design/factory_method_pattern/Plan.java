package com.softhinkers.creational_design.factory_method_pattern;

abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
