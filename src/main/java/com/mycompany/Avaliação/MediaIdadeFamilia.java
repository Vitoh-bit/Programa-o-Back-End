package com.mycompany.Avaliação;

public class MediaIdadeFamilia {
    public static void main(String[] args) {
        // Idades dos membros da família
        int pai = 53;
        int mae = 48;
        int filho = 20;
        int filha = 9;

        // Calculando a média de idade
        double mediaIdade = calcularMediaIdade(pai, mae, filho, filha);

        // Exibindo o resultado
        System.out.printf("A média de idade da família é: %.2f anos%n", mediaIdade);
    }

    public static double calcularMediaIdade(int pai, int mae, int filho, int filha) {
        // Somando as idades
        int somaIdades = pai + mae + filho + filha;
        // Calculando a média
        return (double) somaIdades / 4; // Dividindo pelo número de membros da família
    }
}
