package com.mycompany;

public class Aula03Operadores {
    public static void main(String[] args) {
        /**
         * Tipos de Comentários
         */

        // Comentário de uma linha

        /**
         * Comentários de
         * múltiplas
         * linhas
         */

        /**
         * Declaração de Variáveis
        */

        String var1; // Toda variável declarada sem valor, automaticamente é null,
        String var2 = null; // Variável declarada com valor null
        String var3 = ""; // Variável declarada com valor vazio (diferente de null)
        
        /**
         * Operadores Matemáticos
         */

        int num1 = 5032;
        int num2 = 232;

        // Soma
        int soma = num1 + num2;
        System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

        // Subtração 
        int subtracao = num1 - num2;
        System.out.println("A subtração de " + num1 + " por " + num2 + " é: " + subtracao);

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println ("A multiplicação de " + num1 + " por " + num2 + " é: " + multiplicacao);

        // Divisão
        int divisao = num1 / num2;
        System.out.println ("A divisão e " + num1 + " por " + num2 + " é: " + divisao);

    }
}