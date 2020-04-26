package com.softhinkers.creational_design.abstract_factory_method_pattern.bank.bank_impl;

import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.Bank;

public class CreditSuisse implements Bank {
    private final String BName;

    public CreditSuisse() {
        BName = "CREDIT SUISSE BANK";
    }


    public String getBankName() {
        return BName;
    }
}
