package com.wsousa.comercial;

import com.wsousa.comercial.entidade.Venda;
import com.wsousa.comercial.repositorio.FabricaDeRepositorio;
import com.wsousa.comercial.repositorio.VendaRepositorio;
import com.wsousa.comercial.servico.CadastroVendaServico;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) throws SQLException {
        try (var fabricaDeRepositorio = new FabricaDeRepositorio()) {
            VendaRepositorio vendaRepositorio = fabricaDeRepositorio.criarVendaRepositorio();
            var cadastroVendaServico = new CadastroVendaServico(vendaRepositorio);
            Venda vendaCadastrada = cadastroVendaServico.cadastrar("José da Silva",
                    new BigDecimal("12300.87"), LocalDate.parse("2023-04-19"));

            System.out.println("Venda cadastrada: " + vendaCadastrada);

            System.out.println("Listando todas as vendas:");
            var todasVendas = vendaRepositorio.consultar();
            todasVendas.forEach(System.out::println);
        }
    }

}
