package com.patterns.decorator;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 具体装饰类
 * @Date 2020/7/27
 */
public class ConcretDecorator1 extends Decorator {
    public ConcretDecorator1(Component component) {
        super(component);
        System.out.println("创建具体装饰类对象ConcretDecorator1...");
    }

    public void operation() {
        super.operation();
        addition();
    }

    public void addition() {
        System.out.println("执行具体装饰类1的addition方法...");
    }
}
