package com.river.pattern.creational.builder;

/**
 * @author: he.feng
 * @date: 11:47 2017/11/28
 * @desc:
 **/
public class PersonDirector {

    public Person constructPerson(PersonBuilder persionBuilder) {

        persionBuilder.buildHead();
        persionBuilder.buildBody();
        persionBuilder.buildFoot();
        return persionBuilder.buildPerson();
    }
}
