package com.softhinkers.creational_design.builder_design_pattern.pizza.type;

import com.softhinkers.creational_design.builder_design_pattern.pizza.Pizza;

public abstract class NonVegPizza extends Pizza {
    public abstract float price();

    public abstract String name();

    public abstract String size();
}
