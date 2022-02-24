package com.dio;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(String novaCor){
        cor = novaCor;
        modelo = "corsa";
        capacidadeTanque = 100;
    }

    public static void main(String[] args) {
        String novaCor = "preto";
        Carro meuCarro = new Carro(novaCor);
        int litro = 10;
        int total = valorEncherTanque(litro);
        System.out.println(meuCarro.cor);
        System.out.println("O valor total para encher o tanque é igual a: " + total);
    }

    public static int valorEncherTanque(int litro){
        int valor = litro * 5;
        return valor;
    }
}
