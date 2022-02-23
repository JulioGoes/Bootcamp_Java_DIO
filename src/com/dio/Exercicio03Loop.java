package com.dio;

import java.util.Scanner;

public class Exercicio03Loop {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int numero = 0;
            int maior = 0;

            int count = 0;

            do {
                System.out.println("Digite um número: ");
                numero = scan.nextInt();
                if (numero > maior) maior = numero;
                count++;
            } while(count < 5);

            System.out.println("O maior valor digitado foi: " + maior);
        }
    }
}
