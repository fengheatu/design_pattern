package com.river.pattern.creational.singleton;

/**
 * @author: he.feng
 * @date: 14:00 2017/11/28
 * @desc: 双重校验锁
 **/
public class Singleton7 {

    private volatile static Singleton7 instance;
    private Singleton7() {}

    public static Singleton7 getInstance() {
        if(instance == null) {
            synchronized (Singleton7.class) {
                if(instance == null) {
                    instance = new Singleton7();
                }
            }
        }
        return  instance;
    }
}
