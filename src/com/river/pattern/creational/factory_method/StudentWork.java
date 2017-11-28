package com.river.pattern.creational.factory_method;

/**
 * @author: he.feng
 * @date: 10:30 2017/11/28
 * @desc: ConcreteProduct
 **/
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生写作业");
    }
}
