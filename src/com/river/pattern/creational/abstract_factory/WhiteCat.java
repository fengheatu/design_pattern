package com.river.pattern.creational.abstract_factory;

/**
 * @author: he.feng
 * @date: 11:13 2017/11/28
 * @desc: AbstractProduct
 **/
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("The white cat is eating");
    }
}
