package com.dio;

public class ExercicioVTO3 {
    public static void main(String[] args){
        // Treinando com operadores artiméticos
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 9;
        float media;
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média foi: " + media);

        int num1 = 8;

        if (num1 % 2 == 0){
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é impar!");
        }

        int testando = 1;
        System.out.println("Testando " + testando++);
        System.out.println("Testando " + testando++);
        System.out.println("Testando " + testando++);

    }
}
