package com.softhinkers.creational_design.singleton_design_pattern;

public class EarlyInstant {
    private static EarlyInstant obj = new EarlyInstant();

    private EarlyInstant() {
        System.out.println("Early Instant");
    }

    private String earlyInstantSingleton = "Early Instantiation of Singleton Pattern";

    public static EarlyInstant getInstance() {
        return obj;
    }

    public String getEarlyInstantSingleton() {
        return earlyInstantSingleton;
    }
}