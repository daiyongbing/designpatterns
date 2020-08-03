package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/8/3
 */
public abstract class ISubject {

    protected List<IObserver> obverserList = new ArrayList<>();

    public void addObverser(IObserver observer) {
        obverserList.add(observer);
    }

    public void removeObverser(IObserver observer) {
        obverserList.remove(observer);
    }

    public abstract void notifyObversers();
}
