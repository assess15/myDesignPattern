package com.laychv.design.creational.SingtonPattern;

public class SingletonHungry2 {
    private final static SingletonHungry2 hungry;

    static {
        hungry = new SingletonHungry2();
    }

    private SingletonHungry2() {
    }

    public static SingletonHungry2 getInstance() {
        return hungry;
    }
}
