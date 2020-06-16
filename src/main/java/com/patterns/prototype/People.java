package com.patterns.prototype;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description 原型模式（深拷贝）
 * @Date 2020/6/16
 */
public class People implements Cloneable {
    private String name;
    private String sex;
    private Car car;

    public People(String name, String sex, Car car) {
        this.name = name;
        this.sex = sex;
        this.car = car;
    }

    public People clone() throws CloneNotSupportedException {
        Car car = this.car.clone();
        People people = (People) super.clone();
        people.car = car;
        return people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", car=" + car +
                '}';
    }
}
