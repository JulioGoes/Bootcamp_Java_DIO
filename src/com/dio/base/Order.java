package com.dio.base;

public class Order {

    private final String nome1;
    private final String nome2;

    public Order(String nome1, String nome2){
        this.nome1 = nome1;
        this.nome2 = nome2;
    }

    @Override
    public String toString(){
        return nome1 + nome2;
    }
}