package com.patterns.decorator;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/7/27
 */
public class ConcretDecorator2 extends Decorator {
    public ConcretDecorator2(Component component) {
        super(component);
        System.out.println("创建具体装饰类对象ConcretDecorator2...");
    }

    public void operation() {
        super.operation();
        addition();
    }

    public void addition() {
        System.out.println("执行具体装饰类2的addition方法...");
    }
}
