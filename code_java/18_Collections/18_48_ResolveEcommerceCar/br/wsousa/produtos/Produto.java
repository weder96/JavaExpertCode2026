package br.wsousa.produtos;

import java.util.Objects;

public  class Produto {
    //Atributos
    private String skul;
    private String nome;
    private double preco;

    //Metodos
    public double CalcularCustoOperacional() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(skul, produto.skul) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skul, nome, preco);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSkul() {
        return skul;
    }

    public void setSkul(String skul) {
        this.skul = skul;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
