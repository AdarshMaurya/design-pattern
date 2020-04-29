package com.softhinkers.creational_design.prototype_design_pattern;

public interface Prototype {
    public Prototype getClone(int id, String fname, String lname, String email, String address);
}
