package com.river.pattern.creational.singleton;

/**
 * @author: he.feng
 * @date: 13:59 2017/11/28
 * @desc: 枚举
 *  这种方式是Effective Java作者Josh Bloch 提倡的方式，
 *  它不仅能避免多线程同步问题，而且还能防止反序列化重新创
 *  建新的对象，可谓是很坚强的壁垒啊，不过，个人认为由于1.5
 *  中才加入enum特性，用这种方式写不免让人感觉生疏
 **/
public enum Singleton6 {
    INSTANCE;
    public void whatevetMethod() {

    }
}
