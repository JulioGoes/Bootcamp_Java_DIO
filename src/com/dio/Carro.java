package com.dio;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){

    }

    Carro(String corDoCarro, String modelo, int capacidadeTanque){
        this.cor = corDoCarro;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor(){
        return this.cor;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getModelo(){
        return this.modelo;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    int getCapacidadeTanque(){
        return this.capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    public static int valorEncherTanque(int litro){
        int valor = litro * 5;
        return valor;
    }
}
