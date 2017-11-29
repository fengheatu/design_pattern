package com.river.pattern.creational.prototype;

/**
 * @author: he.feng
 * @date: 10:20 2017/11/29
 * @desc: Prototype
 **/
public class Prototype implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
