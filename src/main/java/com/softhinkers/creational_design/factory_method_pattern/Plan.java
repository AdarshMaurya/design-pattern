package com.softhinkers.factory_method_pattern.creational_design_pattern;

abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}
