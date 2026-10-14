package br.wsousa.carrinho;

import br.wsousa.produtos.Produto;

public class ItemCarrinho {
    //Atributos
    private Produto produto;
    private int quantidade;

    //Metodos


    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubTotal(){
        return produto.getPreco() * quantidade;
    }

    public double getCustoOperacional(){
        return produto.CalcularCustoOperacional() *  quantidade;
    }

    public void adicionarQuantidade(int qt){
        quantidade += qt;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

