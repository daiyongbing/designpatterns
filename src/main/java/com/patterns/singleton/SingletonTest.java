package com.patterns.singleton;

public class SingletonTest {
    public static void main( String[] args )
    {
        LazySingleton lazyInstance1 = LazySingleton.getInstance();
        LazySingleton lazyInstance2 = LazySingleton.getInstance();

        HungrySingleton hungryInstance1 = HungrySingleton.getInstance();
        HungrySingleton hungryInstance2 = HungrySingleton.getInstance();

        System.out.println(lazyInstance1 == lazyInstance2);
        System.out.println(hungryInstance1 == hungryInstance2);

    }
}
