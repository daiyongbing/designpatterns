package com.patterns.template;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 具体子类，实现不同部分
 * @Date 2020/7/28
 */
public class SubClass2 extends Template {
    @Override
    public void differentMethoad1() {
        System.out.println("differentMethoad1 in SubClass2...");
    }

    @Override
    public void differentMethoad2() {
        System.out.println("differentMethoad2 in SubClass2...");
    }
}
