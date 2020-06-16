package com.patterns.prototype;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 原型模式测试
 * @Date 2020/6/16
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype("prototype");
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype);
        System.out.println(prototype1);
        prototype1.setPrototypeName("p");
        System.out.println(prototype);
        System.out.println(prototype1);

        Car car = new Car("宝马", "白色", "3600000");
        People people = new People("zhangsan", "男", car);
        People people1 = people.clone();
        System.out.println("深克隆的People：" + people1);
        people1.setCar(null);
        System.out.println("改变克隆对象后，克隆对象的值：" + people1);
        System.out.println("改变克隆对象后，原对象的值：" + people);
    }
}
