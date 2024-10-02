package com.company;

import java.util.ArrayList;

public class CarDealership {

    private ArrayList<Car> orders;

    static private CarDealership carDealership;

    private CarDealership() {
        this.orders = new ArrayList<>();
    }

    public static CarDealership getInstance() {
        if (carDealership != null) return carDealership;
        carDealership = new CarDealership();
        carDealership.setOrders(new ArrayList<>());
        return carDealership;
    }

    public static CarDealership getInstance(ArrayList<Car> orders) {
        if (carDealership != null) return carDealership;
        carDealership = new CarDealership();
        carDealership.setOrders(orders);
        return carDealership;
    }

    public void orderCar(Car car) { orders.add(car); }

    public void printOrders() {

        if (orders.size() == 0) { System.out.println("No orders :("); return; }

        for (int i = 0; i < orders.size(); i++) System.out.println("Order no. " + (i + 1) + ": " + orders.get(i));

    }

    private void setOrders(ArrayList<Car> orders) {
        this.orders = orders;
    }
}
