package com.dio;
import java.util.Scanner;


public class Exercicio01Loop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade;

            while(true) {
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;

                System.out.println("Idade: ");
                idade = scan.nextInt();
                System.out.println(nome + ", " + idade);
            }
        }

        System.out.println("Continua aqui...");
    }
}
