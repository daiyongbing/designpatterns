package com.patterns.factorymethod;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 玩具
 * @Date 2020/6/16
 */
public class Toys implements IProduct {
    @Override
    public void produce() {
        System.out.println("生产玩具");
    }
}
