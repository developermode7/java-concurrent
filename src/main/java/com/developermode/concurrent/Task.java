package com.developermode.concurrent;

import com.developermode.util.Order;

import java.util.concurrent.Callable;

public class Task implements Callable<Order>
{
    private String orderId;
    private String toCity;
    private String fromCity;

    public Task(String orderId, String toCity, String fromCity) {
        this.orderId = orderId;
        this.toCity = toCity;
        this.fromCity = fromCity;
    }

    @Override
    public Order call() throws Exception
    {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        System.out.println("============================");
        System.out.println("Order details : "  +orderId + " - " +  toCity + " ->> " + fromCity);
        return new Order(orderId,toCity,fromCity);
    }
}
