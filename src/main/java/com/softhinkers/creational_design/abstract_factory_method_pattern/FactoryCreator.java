package com.softhinkers.creational_design.abstract_factory_method_pattern;

import com.softhinkers.creational_design.abstract_factory_method_pattern.factory.AbstractFactory;
import com.softhinkers.creational_design.abstract_factory_method_pattern.factory.impl.BankFactory;
import com.softhinkers.creational_design.abstract_factory_method_pattern.factory.impl.LoanFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
