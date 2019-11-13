package com.patterns.singleton;

public class SingletonTest {
    public static void main( String[] args )
    {
        Singleton lazyInstance1 = Singleton.getLazyInstance();
        Singleton lazyInstance2 = Singleton.getLazyInstance();

        Singleton hungryInstance1 = Singleton.getHungryInstance();
        Singleton hungryInstance2 = Singleton.getHungryInstance();

        System.out.println( lazyInstance1 == lazyInstance2 );
        System.out.println( hungryInstance1 == hungryInstance2 );

    }
}
