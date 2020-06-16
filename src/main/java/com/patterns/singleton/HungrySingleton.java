package com.patterns.singleton;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 饿汉式单例模式
 * @Date 2020/6/16
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    /**
     * @return lazySingleTon
     * @Description 饿汉式
     * @author daiyongbing
     * @date 2020/6/16
     */
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
