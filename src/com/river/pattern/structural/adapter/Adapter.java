package com.river.pattern.structural.adapter;

/**
 * @author: he.feng
 * @date: 10:55 2017/11/29
 * @desc:
 **/
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void adapteeMethod() {
        adaptee.dadpteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter method!");
    }
}
