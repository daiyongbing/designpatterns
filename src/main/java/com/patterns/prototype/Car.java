package com.patterns.prototype;

/**
 * @author daiyongbing
 * @version 1.0
 * @Description Car
 * @Date 2020/6/16
 */
public class Car implements Cloneable {
    private String brand;
    private String color;
    private String price;

    public Car() {
    }

    public Car(String brand, String color, String price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
