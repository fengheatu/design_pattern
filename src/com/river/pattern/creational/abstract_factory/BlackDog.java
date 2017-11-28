package com.river.pattern.creational.abstract_factory;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author: he.feng
 * @date: 11:14 2017/11/28
 * @desc: AbstractProduct
 **/
public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("The Black dog is eating");
    }
}
