package com.patterns.factorymethod;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 玩具工厂
 * @Date 2020/6/16
 */
public class ToysFactory implements IAbstractFactory {
    @Override
    public IProduct newProduct() {
        return new Toys();
    }
}
