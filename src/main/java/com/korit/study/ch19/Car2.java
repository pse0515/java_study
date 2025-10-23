package com.korit.study.ch19;

import java.util.Objects;

public class Car2 extends Object {
    private String model;
    private String color;

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //@Override
    //public boolean equals(Object o) {
    //    if(!(o instanceof Car)) {
    //       return false;
    //      }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != Car2.class) {
            return false;
        }
        Car2 car = (Car2) o;
        // if (!(o instanceof Car car)) return false;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}