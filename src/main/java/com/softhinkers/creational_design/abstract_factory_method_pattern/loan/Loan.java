package com.softhinkers.creational_design.abstract_factory_method_pattern.loan;

public abstract class Loan {
    protected double rate;

    public abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        double emi;
        int month;
        month = years * 12;
        rate = rate / 1200;
        emi = ((rate * Math.pow((1 + rate), month)) /
                ((Math.pow((1 + rate), month)) - 1))
                * loanAmount;
        System.out.println("your monthly EMI is " + emi + " for the amount " + loanAmount + " you have borrowed");
    }
}
