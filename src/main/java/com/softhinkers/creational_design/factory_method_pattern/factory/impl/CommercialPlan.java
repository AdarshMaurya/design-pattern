package com.softhinkers.creational_design.factory_method_pattern.factory.impl;

import com.softhinkers.creational_design.factory_method_pattern.factory.Plan;

public class CommercialPlan extends Plan {
    public void getRate() {
        rate = 7.50;
    }
}
