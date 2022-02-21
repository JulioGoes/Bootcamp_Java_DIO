package com.dio;

public class Exercicio02CF {
    public static void main(String[] args){
        int idade = 1;

        if (idade < 50 && idade >= 18){
            System.out.println("Sua CNH vence a cada 10 anos!");
        } else if (idade >= 50 && idade < 70){
            System.out.println("Sua CNH vence a cada 5 anos!");
        } else if (idade >= 70) {
            System.out.println("Sua CNH vence a cada 3 anos!");
        } else {
            System.out.println("Você não pode tirar sua CNH!");
        }
    }
}
