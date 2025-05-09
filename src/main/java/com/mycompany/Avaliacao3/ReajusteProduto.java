package com.mycompany.Avaliacao3;

public class ReajusteProduto {
    public static void main(String[] args) {
        // Preço original do produto
        double precoOriginal = 1200.00;
        
        // Percentual de reajuste
        double percentualReajuste = 15.0;

        // Calculando o novo preço após o reajuste
        double novoPreco = calcularReajuste(precoOriginal, percentualReajuste);

        // Exibindo o resultado
        System.out.printf("O preço original do produto era: R$ %.2f%n", precoOriginal);
        System.out.printf("O novo preço do produto após um reajuste de %.2f%% é: R$ %.2f%n", percentualReajuste, novoPreco);
    }

    public static double calcularReajuste(double preco, double percentual) {
        // Calculando o valor do reajuste
        double valorReajuste = preco * (percentual / 100);
        // Retornando o novo preço
        return preco + valorReajuste;
    }
}
