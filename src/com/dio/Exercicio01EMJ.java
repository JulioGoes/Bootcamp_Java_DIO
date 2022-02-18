package com.dio;

/**
 * Calcule as 4 operações básicas: soma, subtração, divisão e multiplicação
 * Sempre 2 valores devem ser passados
 */
public class Exercicio01EMJ {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 2;
        float num1_f = (float) num1;
        float num2_f = (float) num2;
        int soma = soma(num1, num2);
        int sub = sub(num1, num2);
        int multi = multi(num1, num2);
        float div = div(num1_f, num2_f);
        System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + soma);
        System.out.println("A subtração de " + num1 + " e " + num2 + " é igual a " + sub);
        System.out.println("A divisão de " + num1 + " e " + num2 + " é igual a " + div);
        System.out.println("A multiplicação de " + num1 + " e " + num2 + " é igual a " + multi);
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }
    public static float div(float num1_f, float num2_f) {
        return num1_f / num2_f;
    }
    public static int multi(int num1, int num2) {
        return num1 * num2;
    }
}