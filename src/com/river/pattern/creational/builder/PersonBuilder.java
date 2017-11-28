package com.river.pattern.creational.builder;

/**
 * @author: he.feng
 * @date: 11:31 2017/11/28
 * @desc:
 **/
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
