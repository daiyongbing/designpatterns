package com.patterns.decorator;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/7/27
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcretComponent();
        component.operation();

        ConcretDecorator1 decorator1 = new ConcretDecorator1(component);
        ConcretDecorator2 decorator2 = new ConcretDecorator2(component);
        decorator1.operation();
        decorator2.operation();

    }
}
