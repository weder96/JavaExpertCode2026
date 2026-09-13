package com.wsousa.comercial.repositorio;

import com.wsousa.comercial.entidade.Venda;

import java.util.List;

public interface VendaRepositorio {
    Venda adicionar(Venda venda);

    List<Venda> consultar();
}
