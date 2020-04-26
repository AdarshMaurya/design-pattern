package com.softhinkers.creational_design.abstract_factory_method_pattern.factory;

import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.Bank;
import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
