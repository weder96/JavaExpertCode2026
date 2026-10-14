package br.edu.DominioProdutos;

public class ProdutoDigital extends Produto {
    @Override
    public double calcularCustoOperacional() {
        return getPreco();
    }
}
