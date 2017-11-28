package com.river.pattern.creational.abstract_factory;

/**
 * @author: he.feng
 * @date: 11:08 2017/11/28
 * @desc:
 **/
public class BlackAnimalFactory implements  IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
