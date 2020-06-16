package com.patterns.factorymethod;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 工厂方法模式
 * @Date 2020/6/16
 */
public class FactoryMethod {
    public static void main(String[] args) {
        IAbstractFactory clothesFactory = new ClothesFactory();
        IAbstractFactory toysFactory = new ToysFactory();
        IProduct clothes = clothesFactory.newProduct();
        IProduct toys = toysFactory.newProduct();
        clothes.produce();
        toys.produce();
    }
}
