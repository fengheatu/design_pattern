package com.river.pattern.creational.builder;

/**
 * @author: he.feng
 * @date: 11:40 2017/11/28
 * @desc:
 **/
public class ManBuilder implements PersonBuilder {

    Person person;

    public ManBuilder() {
        this.person = new Man();
    }

    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
