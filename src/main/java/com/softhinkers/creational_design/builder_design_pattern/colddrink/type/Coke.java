package com.softhinkers.creational_design.builder_design_pattern.colddrink.type;

import com.softhinkers.creational_design.builder_design_pattern.colddrink.ColdDrink;

public abstract class Coke extends ColdDrink {

    public abstract float price();

    public abstract String name();

    public abstract String size();
}
