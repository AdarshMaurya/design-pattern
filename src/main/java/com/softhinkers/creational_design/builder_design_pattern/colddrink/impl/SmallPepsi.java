package com.softhinkers.creational_design.builder_design_pattern.colddrink.impl;

import com.softhinkers.creational_design.builder_design_pattern.colddrink.type.Pepsi;

public class SmallPepsi extends Pepsi {
    @Override
    public float price() {
        return 17.0f;
    }

    @Override
    public String name() {
        return "Small Pepsi";
    }

    @Override
    public String size() {
        return "Small Size";
    }
}
