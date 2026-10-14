package br.wsousa.produtos;

public class ProdutoFisico extends Produto {
    //Atributos
    private double pesoKg;

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    @Override
    public double CalcularCustoOperacional() {
        return pesoKg * 0.20;
    }
}
