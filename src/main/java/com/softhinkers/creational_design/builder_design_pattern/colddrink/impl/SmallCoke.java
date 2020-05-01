package com.softhinkers.creational_design.builder_design_pattern.colddrink.impl;

import com.softhinkers.creational_design.builder_design_pattern.colddrink.type.Coke;

public class SmallCoke extends Coke {
    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
        return "Small Coke";
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
