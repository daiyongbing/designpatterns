package com.patterns.decorator;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 装饰类
 * @Date 2020/7/27
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
        System.out.println("创建Decorator对象...");
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("这是装饰类中的operation方法...");
    }
}
