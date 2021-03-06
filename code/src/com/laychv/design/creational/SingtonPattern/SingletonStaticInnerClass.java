package com.laychv.design.creational.SingtonPattern;

/**
 * 静态内部类- 单例模式
 */
public class SingletonStaticInnerClass {
    private SingletonStaticInnerClass() {
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingleHolder.single;
    }

    private static class SingleHolder {
        private static final SingletonStaticInnerClass single = new SingletonStaticInnerClass();
    }
}
