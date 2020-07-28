package com.patterns.template;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description TODO
 * @Date 2020/7/28
 */
public class Main {
    public static void main(String[] args) {
        Template template1 = new SubClass1();
        Template template2 = new SubClass2();
        template1.templateMethoad();
        template2.templateMethoad();
    }
}
