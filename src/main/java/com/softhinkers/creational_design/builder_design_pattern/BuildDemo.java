package com.softhinkers.creational_design.builder_design_pattern;

import java.io.IOException;

public class BuildDemo {
    public static void main(String[] args) throws IOException {
        OrderBuilder builder = new OrderBuilder();
        OrderedItems orderedItems=builder.preparePizza();
        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
    }
}
