package com.river.pattern.creational.factory_method;

/**
 * @author: he.feng
 * @date: 10:32 2017/11/28
 * @desc: ConcreteProduct
 **/
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师审批作业");
    }
}
