package com.company;

import com.company.Attributes.Color;
import com.company.Attributes.EngineType;
import com.company.Attributes.WheelsType;
import com.company.Builders.CarBuilder;

public class Car {

    EngineType engine;
    Color color;
    WheelsType wheels;

    public Car(EngineType engine, Color color, WheelsType wheels) {
        this.engine = engine;
        this.color = color;
        this.wheels = wheels;
    }

    public static CarBuilder builder() { return new CarBuilder(); }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }
}
