package com.dio;
import com.dio.base.Quadrilatero;
public class Exercicio04EMJ {
    public static void main(String[] args){
        int quadrado = Quadrilatero.area(4);
        double retangulo = Quadrilatero.area(4d, 6d);
        int triangulo = Quadrilatero.area(4, 6, 6);
        float losango = Quadrilatero.area(4f, 6f);

        System.out.println("Área do Quadrado: " + quadrado);
        System.out.println("Área do Retangulo: " + retangulo);
        System.out.println("Área do Triangulo: " + triangulo);
        System.out.println("Área do Losango: " + losango);
    }
}
