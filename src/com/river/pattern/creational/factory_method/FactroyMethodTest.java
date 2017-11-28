package com.river.pattern.creational.factory_method;

/**
 * @author: he.feng
 * @date: 10:17 2017/11/28
 * @desc: 工厂方法模式
 **/
public class FactroyMethodTest {

    /**
     * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类
     *
     * #适用性：
     *        1.当一个类不知道它所必须创建的对象的类的时候。
     *        2.当一个类希望由它的子类来指定它所创建的对象的时候。
     *        3.当将创建对象的职责委托给多个帮助类中的某一个，并且希望将哪一个
     *        帮助子类是代理者这一信息局部化的时候。
     * #参与者：
     *        1.Product
     *             定义工厂方法所创建的对象的接口。
     *        2.ConcreteProduct
     *             实现Product 接口
     *        3.Creator
     *             声明工厂方法，该方法返回一个Product 类型的对象
     *             Creator 也可以定义一个工厂方法的缺省实现，它返回一个缺省的ConcreteProduct 对象。
     *        4.ConcreteCreator
     *             重定义工厂方法以返回一个ConcreteProduct 实例。
     *
     *        例子
     *
     */

    public static void main(String[] args) {
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        StudentWork studentWork = (StudentWork) studentWorkFactory.getWork();
        studentWork.doWork();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        TeacherWork teacherWork = (TeacherWork) teacherWorkFactory.getWork();
        teacherWork.doWork();
    }
}
