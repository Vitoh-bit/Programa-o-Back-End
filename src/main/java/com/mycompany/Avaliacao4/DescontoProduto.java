package com.mycompany.Avaliacao4;

public class DescontoProduto {
    public static void main(String[] args) {
        // Preço original do produto
        double precoOriginal = 850.00;
        
        // Percentual de desconto
        double percentualDesconto = 30.0;

        // Calculando o novo preço após o desconto
        double novoPreco = calcularDesconto(precoOriginal, percentualDesconto);

        // Exibindo o resultado
        System.out.printf("O preço original do produto era: R$ %.2f%n", precoOriginal);
        System.out.printf("O novo preço do produto após um desconto de %.2f%% é: R$ %.2f%n", percentualDesconto, novoPreco);
    }

    public static double calcularDesconto(double preco, double percentual) {
        // Calculando o valor do desconto
        double valorDesconto = preco * (percentual / 100);
        // Retornando o novo preço
        return preco - valorDesconto;
    }
}
