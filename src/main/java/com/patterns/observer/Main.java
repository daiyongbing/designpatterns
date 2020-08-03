package com.patterns.observer;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/8/3
 */
public class Main {
    public static void main(String[] args) {
        IObserver observer1 = new ConcretObserver1();
        IObserver observer2 = new ConcretObserver2();
        ISubject subject = new ConcretSubject();
        subject.addObverser(observer1);
        subject.addObverser(observer2);
        subject.notifyObversers();
    }
}
