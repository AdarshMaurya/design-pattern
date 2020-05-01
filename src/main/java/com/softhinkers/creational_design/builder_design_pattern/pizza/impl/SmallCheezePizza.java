package com.softhinkers.creational_design.builder_design_pattern.pizza.impl;

import com.softhinkers.creational_design.builder_design_pattern.pizza.type.VegPizza;

public class SmallCheezePizza extends VegPizza {
    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Cheese Pizza";
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
