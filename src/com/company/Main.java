package com.company;

import com.company.Attributes.Color;
import com.company.Attributes.EngineType;
import com.company.Attributes.WheelsType;

public class Main {

    public static void main(String[] args) {

        // Create 2 cars

        Car car = Car.builder()
                .setColor(Color.Blue)
                .setEngine(EngineType.Engine_1L)
                .setWheels(WheelsType.Standard)
                .build();

        Car car1 = Car.builder()
                .setColor(Color.Red)
                .setEngine(EngineType.Engine_2L)
                .setWheels(WheelsType.Offroad)
                .build();

        // One way of getting CarDealership

        CarDealership carDealership = CarDealership.getInstance(); // Create dealership

        // Set orders

        carDealership.orderCar(car);
        carDealership.orderCar(car1);

        /* Second way of getting carDealership
         *
         * ArrayList<Car> predefinedOrders = new ArrayList<>();
         *
         * predefinedOrders.add(car);
         * predefinedOrders.add(car1);
         *
         * CarDealership.getInstance(predefinedOrders);
         *
         * */

        // Print the orders

        System.out.println("Orders: ");

        carDealership.printOrders();

    }
}
