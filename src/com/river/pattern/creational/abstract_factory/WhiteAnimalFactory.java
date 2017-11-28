package com.river.pattern.creational.abstract_factory;

/**
 * @author: he.feng
 * @date: 11:09 2017/11/28
 * @desc: ConcreteFactory
 **/
public class WhiteAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
