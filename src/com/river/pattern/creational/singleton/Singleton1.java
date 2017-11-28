package com.river.pattern.creational.singleton;

/**
 * @author: he.feng
 * @date: 13:42 2017/11/28
 * @desc: 懒汉模式，线程不安全 ，这种写法lazy loading很明显
 *        但是致命的是在多线程不能正常工作
 **/
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {}

    public static Singleton1 getInstance() {

        if(instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }
}
