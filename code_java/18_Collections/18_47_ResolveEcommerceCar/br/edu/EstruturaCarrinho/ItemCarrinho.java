package br.edu.EstruturaCarrinho;

import br.edu.DominioProdutos.*;

public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotalItem() {
        return produto.getPreco() * quantidade;
    }

    public double getCustoOperacionalItem() {
        return produto.calcularCustoOperacional();
    }

    public void adicionarQuantidade(int qnt) {
        quantidade += qnt;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
