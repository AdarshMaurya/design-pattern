package com.softhinkers.creational_design.abstract_factory_method_pattern.factory.impl;

import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.Bank;
import com.softhinkers.creational_design.abstract_factory_method_pattern.factory.AbstractFactory;
import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.Loan;
import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.loan_impl.BussinessLoan;
import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.loan_impl.EducationLoan;
import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.loan_impl.HomeLoan;

public class LoanFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        return null;
    }

    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("Business")) {
            return new BussinessLoan();
        } else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }

        return null;
    }
}
