package com.dio;
import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Exercicio02Loop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;

            while(true){
                System.out.println("Digite sua nota:");
                nota = scan.nextInt();
                if (nota < 1 || nota > 10){
                    System.out.println("Valor Inválido");
                    break;
                } else {
                    System.out.println("Sua nota foi de: " + nota);
                }
            }
        }
    }
}