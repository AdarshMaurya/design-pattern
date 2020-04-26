package com.softhinkers.creational_design.abstract_factory_method_pattern.bank.bank_impl;

import com.softhinkers.creational_design.abstract_factory_method_pattern.bank.Bank;

public class Barclays implements Bank {
   private final String BName;

    public Barclays() {
        BName = "BARCLAYS BANK";
    }

    public String getBankName() {
        return BName;
    }
}
