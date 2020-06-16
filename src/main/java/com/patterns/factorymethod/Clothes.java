package com.patterns.factorymethod;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 服装
 * @Date 2020/6/16
 */
public class Clothes implements IProduct {

    @Override
    public void produce() {
        System.out.println("生产衣服");
    }
}
