package com.softhinkers.creational_design.factory_method_pattern;

import com.softhinkers.creational_design.factory_method_pattern.factory.impl.CommercialPlan;
import com.softhinkers.creational_design.factory_method_pattern.factory.impl.DomesticPlan;
import com.softhinkers.creational_design.factory_method_pattern.factory.impl.InstitutionalPlan;
import com.softhinkers.creational_design.factory_method_pattern.factory.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }

        if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }

        if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }

}
