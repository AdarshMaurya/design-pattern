package com.softhinkers.creational_design.abstract_factory_method_pattern.loan.loan_impl;

import com.softhinkers.creational_design.abstract_factory_method_pattern.loan.Loan;

public class EducationLoan extends Loan {
    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
