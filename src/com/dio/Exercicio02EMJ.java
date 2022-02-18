package com.dio;
/**
* A partir da hora do dia, informe a mensagem adequada: Bom Dia, Boa Tarde e Boa Noite
*/

public class Exercicio02EMJ {
    public static void main(String[] args){
        int hora = 15;
        if (hora >= 6 && hora <= 12){
            System.out.println("Bom Dia!");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
}
