package com.softhinkers.creational_design.factory_method_pattern.factory.impl;

import com.softhinkers.creational_design.factory_method_pattern.factory.Plan;

public class DomesticPlan extends Plan {

    public void getRate() {
        rate = 3.50;
    }
}
