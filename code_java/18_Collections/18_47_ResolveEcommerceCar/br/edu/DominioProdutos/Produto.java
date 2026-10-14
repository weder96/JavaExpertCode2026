package br.edu.DominioProdutos;

public abstract class Produto {
    private String sku;
    private String nome;
    private double preco;

    public abstract double calcularCustoOperacional();

    @Override
    public boolean equals(Object o) {
        return sku == o;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSku() {
        return sku;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
