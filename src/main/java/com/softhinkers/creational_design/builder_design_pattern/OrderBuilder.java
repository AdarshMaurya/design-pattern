package com.softhinkers.creational_design.builder_design_pattern;

import com.softhinkers.creational_design.builder_design_pattern.pizza.impl.SmallCheezePizza;
import com.softhinkers.creational_design.builder_design_pattern.pizza.impl.SmallNonVegPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {

    public OrderedItems preparePizza() throws IOException {

        OrderedItems itemsOrder = new OrderedItems();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");

        int pizzaandcolddrinkchoice = Integer.parseInt(br.readLine());
        switch (pizzaandcolddrinkchoice) {

            case 1: {
                System.out.println("You ordered Veg Pizza");
                System.out.println("\n\n");
                System.out.println(" Enter the types of Veg-Pizza ");
                System.out.println("------------------------------");
                System.out.println("        1.Cheeze Pizza        ");
                System.out.println("        2.Onion Pizza        ");
                System.out.println("        3.Masala Pizza        ");
                System.out.println("        4.Exit            ");
                System.out.println("------------------------------");
                int vegpizzachoice = Integer.parseInt(br.readLine());
                switch (vegpizzachoice) {
                    case 1: {
                        System.out.println("You ordered Cheeze Pizza");

                        System.out.println("Enter the cheeze pizza size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Cheeze Pizza ");
                        System.out.println("    2. Medium Cheeze Pizza ");
                        System.out.println("    3. Large Cheeze Pizza ");
                        System.out.println("    4. Extra-Large Cheeze Pizza ");
                        System.out.println("------------------------------------");
                        int cheezepizzasize = Integer.parseInt(br.readLine());
                        switch (cheezepizzasize){
                            case 1:
                                itemsOrder.addItems(new SmallCheezePizza());
                                break;
                        }
                    }
                }

            }

            case 2:{

                System.out.println("You ordered Non-Veg Pizza");
                System.out.println("\n\n");

                System.out.println("Enter the Non-Veg pizza size");
                System.out.println("------------------------------------");
                System.out.println("    1. Small Non-Veg  Pizza ");
                System.out.println("    2. Medium Non-Veg  Pizza ");
                System.out.println("    3. Large Non-Veg  Pizza ");
                System.out.println("    4. Extra-Large Non-Veg  Pizza ");
                System.out.println("------------------------------------");


                int nonvegpizzasize=Integer.parseInt(br.readLine());
                switch (nonvegpizzasize){
                    case 1:
                        itemsOrder.addItems(new SmallNonVegPizza());
                        break;
                }
            }
        }


        return itemsOrder;
    }
}
