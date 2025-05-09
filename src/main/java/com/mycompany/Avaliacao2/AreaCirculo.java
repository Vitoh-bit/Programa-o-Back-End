package com.mycompany.Avaliacao2;

public class AreaCirculo {
    public static void main(String[] args) {
        // Área do círculo
        double area = 25.0;

        // Usando Math.PI para o valor de π
        double pi = Math.PI; // ou você pode usar 3.14

        // Calculando o raio a partir da área
        double raio = Math.sqrt(area / pi);

        // Exibindo o resultado
        System.out.printf("O raio do círculo com área de %.2f cm² é: %.2f cm%n", area, raio);
    }
}
