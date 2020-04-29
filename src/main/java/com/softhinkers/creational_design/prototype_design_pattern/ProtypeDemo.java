package com.softhinkers.creational_design.prototype_design_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtypeDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter person id: ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter first name: ");
        String fname = br.readLine();

        System.out.println("Enter last name: ");
        String lname = br.readLine();

        System.out.println("Enter email: ");
        String email = br.readLine();

        System.out.println("Enter address: ");
        String address = br.readLine();

        Person person = new Person(id, fname, lname, email, address);
        person.showRecord();

        Person person2 = (Person) person.getClone(2, "softhinkers", "com",
                "user@softhinkers.com", "https://www.softhinkers.com");
        person2.showRecord();

    }
}
