package com.patterns.decorator;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 具体构件
 * @Date 2020/7/27
 */
public class ConcretComponent implements Component {
    public ConcretComponent() {
        System.out.println("创建具体构件对象ConcretComponent...");
    }

    @Override
    public void operation() {
        System.out.println("执行具体构件ConcretComponent的operation方法...");
    }
}
