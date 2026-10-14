package br.edu.DominioProdutos;

public class ProdutoFisico extends Produto {
    private double pesoKg;

    @Override
    public double calcularCustoOperacional() {
        return getPreco() * pesoKg;
    }
}
