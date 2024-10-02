package com.company.Builders;

import com.company.Attributes.Color;
import com.company.Attributes.EngineType;
import com.company.Attributes.WheelsType;
import com.company.Car;

public class CarBuilder {

    EngineType engine;
    Color color;
    WheelsType wheels;

    public Car build() { return new Car(engine, color, wheels); }

    public CarBuilder setEngine(EngineType engine) { this.engine = engine; return this; }

    public CarBuilder setColor(Color color) { this.color = color; return this; }

    public CarBuilder setWheels(WheelsType wheels) { this.wheels = wheels; return this; }

}
