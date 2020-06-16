package com.patterns.singleton;

/**
 * @Description: 懒汉式单例模式
 * @Author: daiyongbing
 * @CreateDate: 2019/11/13
 * @Version: 1.0
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    ;

    /**
     * @Description 懒汉式
     * @author daiyongbing
     * @return hungrySingleTon
     * @date 2019/11/13
     */
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
