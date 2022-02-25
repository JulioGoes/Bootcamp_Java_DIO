package com.dio;

public class Moto extends Veiculo {

    int ano;
    Moto(){
        
    }

    Moto(String modelo, String cor, int quantidadeRodas, int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.quantidadeRodas = quantidadeRodas;
        this.ano = ano;
    }
}
