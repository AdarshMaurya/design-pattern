package com.softhinkers.creational_design.singleton_design_pattern;

public class Main {
    public static void main(String args[]) {
        String earlyInstant = EarlyInstant.getInstance().getEarlyInstantSingleton();
        System.out.println(earlyInstant);

        String lazyInstant = LazyInstant.getInstance().getLazyInstantSingleton();
        System.out.println(lazyInstant);
    }
}
