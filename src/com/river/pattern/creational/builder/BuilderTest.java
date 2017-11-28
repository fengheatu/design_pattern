package com.river.pattern.creational.builder;

/**
 * @author: he.feng
 * @date: 11:24 2017/11/28
 * @desc: 建造者模式
 **/
public class BuilderTest {

    /**
     *将一个复杂对象的构建与它的表示分离，使同样的构建过程可以创建不同的表示。
     *
     *
     * #适用性
     *  1.当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
     *  2.当构造过程必须允许被构造的对象有不同的表示时。
     *
     *
     *#参与者
     * 1.Builder
     *      为创建一个Product 对象的各个部件指定抽象接口。
     * 2.ConcreteBuilder
     *      实现Builder 的接口以构造和装配该产品的各个部件。定义并明确它所创建的表示并提供一个检索产品的接口。
     *
     * 3.Director
     * 构造一个使用Builder 接口的对象。
     *
     *
     * 4.Product
     * 表示被构造的复杂对象。ConcreteBuilder 创建该产品的内部表示并定义它的装配过程。
     * 包含定义组成部件的类，包括将这些部件装配成最终产品的接口。
     *
     *
     * */

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
}
