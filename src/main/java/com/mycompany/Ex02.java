package com.mycompany;

import java.util.Scanner;

public class Ex02 {

     public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        
        int i = 1; // Inicializa o contador
        
        // Laço while para calcular e exibir a tabuada
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++; // Incrementa o contador

        }
        
        // Fecha o scanner
        scanner.close();
    }
}
