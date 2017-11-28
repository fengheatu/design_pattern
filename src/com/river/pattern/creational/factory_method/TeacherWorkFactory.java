package com.river.pattern.creational.factory_method;

/**
 * @author: he.feng
 * @date: 10:47 2017/11/28
 * @desc:
 **/
public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
