package com.patterns.observer;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/8/3
 */
public class ConcretObserver2 implements IObserver {
    @Override
    public void update() {
        System.out.println("ConcretObserver2 update...");
    }
}
