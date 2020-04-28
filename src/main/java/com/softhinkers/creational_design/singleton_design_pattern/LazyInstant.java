package com.softhinkers.creational_design.singleton_design_pattern;

public class LazyInstant {
    private static LazyInstant obj;
    private String lazyInstantSingleton = "Lazy Instantiation of Singleton Pattern";

    private LazyInstant() {
        System.out.println("Lazy Instant");
    }

    public static LazyInstant getInstance() {
        if (obj == null) {
            synchronized (LazyInstant.class) {
                if (obj == null) {
                    obj = new LazyInstant();
                }
            }
        }
        return obj;
    }

    public String getLazyInstantSingleton() {
        return lazyInstantSingleton;
    }
}
