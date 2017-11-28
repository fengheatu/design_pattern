package com.river.pattern.creational.abstract_factory;

/**
 * @author: he.feng
 * @date: 11:15 2017/11/28
 * @desc: AbstractProduct
 **/
public class WhiteDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The white dog is eating");
    }
}
