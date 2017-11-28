package com.river.pattern.creational.factory_method;

/**
 * @author: he.feng
 * @date: 10:46 2017/11/28
 * @desc: ConcreteCreator
 **/
public class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
