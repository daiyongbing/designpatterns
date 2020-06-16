package com.patterns.factorymethod;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 服装工厂
 * @Date 2020/6/16
 */
public class ClothesFactory implements IAbstractFactory {
    @Override
    public IProduct newProduct() {
        return new Clothes();
    }
}
