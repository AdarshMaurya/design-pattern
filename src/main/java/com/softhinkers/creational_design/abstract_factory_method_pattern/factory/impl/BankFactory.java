package com.softhinkers.creational_design.abstract_factory_method_pattern.factory.impl;

import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.Bank;
import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.bank_impl.Barclays;
import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.bank_impl.CreditSuisse;
import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.bank_impl.JPMorgan;
import com.softhinkers.creational_design.abstract_factory_method_pattern.factory.AbstractFactory;
import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.Loan;

public class BankFactory extends AbstractFactory {

    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase("BARCLAYS")) {
            return new Barclays();
        } else if (bank.equalsIgnoreCase("CREDITSUISSE")) {
            return new CreditSuisse();
        } else if (bank.equalsIgnoreCase("JPMORGAN")) {
            return new JPMorgan();
        }
        return null;
    }

    public Loan getLoan(String loan) {
        return null;
    }
}
