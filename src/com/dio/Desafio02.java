package com.dio;

public class Desafio02 {
    public static void main(String[] args){
        int x1 = 3;
        int y1 = 5;
        int x2 = 3;
        int y2 = 5;
        // if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
        if(x1 == x2 && y1 == y2){	
            System.out.println("0");
        } else if ((x1 - x2) <= 0 && (y1 - y2) >= 0) {
            System.out.println("1");
        } else if((x1 - x2) >= 0 && (y1 - y2) <= 0){
            System.out.println("1");	
        } else {
            System.out.println("2");
        }
    }
}
