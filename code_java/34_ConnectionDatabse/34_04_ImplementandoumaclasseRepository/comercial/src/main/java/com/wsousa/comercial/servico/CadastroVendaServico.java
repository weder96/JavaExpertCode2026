package com.wsousa.comercial.servico;

import com.wsousa.comercial.entidade.Venda;
import com.wsousa.comercial.repositorio.VendaRepositorio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CadastroVendaServico {

    public Venda cadastrar(String nomeCliente, BigDecimal valorTotal, LocalDate dataPagamento) {
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegocioException("Valor total deve ser maior que 0");
        }
        if (dataPagamento.isAfter(LocalDate.now())) {
            throw new NegocioException("Data do pagamento não pode ser uma data futura");
        }

        var vendaRepositorio = new VendaRepositorio();
        return vendaRepositorio.adicionar(new Venda(nomeCliente, valorTotal, dataPagamento));
    }

}
