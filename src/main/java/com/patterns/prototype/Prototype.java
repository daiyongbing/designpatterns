package com.patterns.prototype;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 原型模式(浅拷贝)
 * @Date 2020/6/16
 */
public class Prototype implements Cloneable {
    private String prototypeName;

    public Prototype() {
    }

    public Prototype(String prototypeName) {
        this.prototypeName = prototypeName;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public String getPrototypeName() {
        return prototypeName;
    }

    public void setPrototypeName(String prototypeName) {
        this.prototypeName = prototypeName;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "prototypeName='" + prototypeName + '\'' +
                '}';
    }
}
