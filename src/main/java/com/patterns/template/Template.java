package com.patterns.template;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 模板类
 * @Date 2020/7/28
 */
public abstract class Template {

    public void templateMethoad() {
        differentMethoad1();
        differentMethoad2();
        commonMethoad1();
        commonMethoad2();
    }

    public abstract void differentMethoad1();

    public abstract void differentMethoad2();

    public void commonMethoad1() {
        System.out.println("commonMethoad1...");
    }

    public void commonMethoad2() {
        System.out.println("commonMethoad2...");
    }
}
