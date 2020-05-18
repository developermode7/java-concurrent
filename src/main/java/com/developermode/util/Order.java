package com.developermode.util;

public class Order
{
    private String orderId;
    private String fromCity;
    private String toCity;

    public Order(String orderId, String fromCity, String toCity) {
        this.orderId = orderId;
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", fromCity='" + fromCity + '\'' +
                ", toCity='" + toCity + '\'' +
                '}';
    }
}
