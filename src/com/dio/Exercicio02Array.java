package com.dio;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Exercicio02Array {
    public static void main(String[] args){
        char[] vetor = {'a', 'b', 'c', 'd', 'e'};
        int count = 0;
        int quantidadeConsoantes = 0;
        while(count < vetor.length){
            if (vetor[count] == 'a' ||
                vetor[count] == 'e' ||
                vetor[count] == 'i' ||
                vetor[count] == 'o' ||
                vetor[count] == 'u'){
                System.out.println("É uma vogal");
            } else {
                System.out.println("É uma consoante");
                quantidadeConsoantes++;
            }
            count++;
        }
        System.out.println("Foram contabilizadas " + quantidadeConsoantes + " consoante(s).");

    }
}
