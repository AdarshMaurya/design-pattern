package com.softhinkers.creational_design.builder_design_pattern.pizza.impl;

import com.softhinkers.creational_design.builder_design_pattern.pizza.type.NonVegPizza;

public class SmallNonVegPizza extends NonVegPizza {
    @Override
    public float price() {
        return 75.0f;
    }

    @Override
    public String name() {
        return "Non Veg Pizza";
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
