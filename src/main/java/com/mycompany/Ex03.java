package com.mycompany;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Estrutura condicional simples (if, else)
         * 
         * pode ser lida como: SE, SENÃO 
         * 
         * a condição verdadeira é executada dentro do if
         */
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        // % é o resto da divisão
        // comparando com 0, significa que o número é par
        if (num % 2 == 0) {
            System.out.println(num + " é par !!");
        } else {
            System.out.println(num + " é ímpar !!");
        }

        /**
         * Estrutura condicional composta (if, else if, else)
         * 
         * Verificação do IMC baseada na tabela de classificação enviada
         */
        System.out.print("Digite seu IMC: ");
        double imc = scanner.nextDouble();

        if (imc < 16) {
            System.out.println("Magreza grau III");
        } else if (imc >= 16 && imc <= 16.9) {
            System.out.println("Magreza grau II");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("Magreza grau I");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Eutrofia");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Pré-obesidade");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade moderada (grau I)");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade severa (grau II)");
        } else if (imc >= 40) {
            System.out.println("Obesidade muito severa (grau III)");
        }

        scanner.close();
    }
}
