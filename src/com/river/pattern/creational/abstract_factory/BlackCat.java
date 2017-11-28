package com.river.pattern.creational.abstract_factory;

/**
 * @author: he.feng
 * @date: 11:12 2017/11/28
 * @desc: AbstractProduct
 **/
public class BlackCat implements  ICat {
    @Override
    public void eat() {
        System.out.println("The black cat is eating");
    }
}
