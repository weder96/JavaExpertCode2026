package com.wsousa.seguradora.servico;

import com.wsousa.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("----------------------");
        System.out.println("Proposta de seguro");
        System.out.println("----------------------");
        System.out.println(bem.descrever());
        System.out.printf("Prêmio: R$%.2f%n", bem.calcularValorPremio());
    }

}
