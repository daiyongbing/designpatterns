package com.patterns.observer;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/8/3
 */
public class ConcretSubject extends ISubject {
    @Override
    public void notifyObversers() {
        for (IObserver observer : obverserList) {
            observer.update();
        }
    }
}
