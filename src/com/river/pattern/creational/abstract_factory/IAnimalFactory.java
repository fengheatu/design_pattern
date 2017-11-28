package com.river.pattern.creational.abstract_factory;

/**
 * @author: he.feng
 * @date: 11:05 2017/11/28
 * @desc: AbstractFactory
 **/
public interface IAnimalFactory {

    ICat createCat();

    IDog createDog();
}
