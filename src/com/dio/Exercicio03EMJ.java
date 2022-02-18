package com.dio;

public class Exercicio03EMJ {
    public static void main(String[] args){
        float emprestimo = (float) 100.0;
        float taxa = (float) 0.05;
        float total = calculaTotal(emprestimo, taxa);
        System.out.println("O valor total do emprestimo foi de: " + total);
    }

    public static float calculaTotal(float emprestimo, float taxa){
        return emprestimo + (emprestimo * taxa);
    }
}
