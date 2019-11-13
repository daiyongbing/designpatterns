package com.patterns.singleton;

/**
 * @Description:    单例模式
 * @Author:         daiyongbing
 * @CreateDate:     2019/11/13
 * @Version:        1.0
 */
public class Singleton {
    private static final Singleton lazySingleton = new Singleton();
    private static volatile Singleton hungrySingleton = null;
    private Singleton(){};
    /**
     * @Description 饿汉式
     * @author      daiyongbing
     * @return      lazySingleTon
     * @date        2019/11/13
     */
    public static Singleton getLazyInstance(){
        return lazySingleton;
    }

    /**
     * @Description 懒汉式
     * @author      daiyongbing
     * @return      hungrySingleTon
     * @date        2019/11/13
     */
    public static synchronized Singleton getHungryInstance(){
            if (hungrySingleton == null){
                hungrySingleton = new Singleton();
            }
        return hungrySingleton;
    }
}
