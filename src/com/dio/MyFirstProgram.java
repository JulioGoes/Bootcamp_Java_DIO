package com.dio;

import com.dio.base.Order;

public class MyFirstProgram {

    public static void main(String[] args) {
        final Order order = new Order("Hello World");
        System.out.println(order);
    }
}