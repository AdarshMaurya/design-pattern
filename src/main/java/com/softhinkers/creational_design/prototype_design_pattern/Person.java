package com.softhinkers.creational_design.prototype_design_pattern;

public class Person implements Prototype {
    private int id;
    private String fname, lname, email;
    private String address;

    public Person() {
        System.out.println("Person's details:");
        System.out.println("ID" + "\t" + "FName" + "\t" + "LName" + "\t" + "Email" + "\t" + "Address");
    }

    public Person(int id, String fname, String lname, String email, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
    }

    public void showRecord() {
        System.out.println(id + "\t" + fname + "\t" + lname + "\t" + email + "\t" + address);
    }

    @Override
    public Prototype getClone(int id, String fname, String lname, String email, String address) {
        return  new Person(id, fname,lname, email, address);
    }
}
