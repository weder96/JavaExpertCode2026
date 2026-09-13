package com.wsousa.comercial.repositorio;

import com.wsousa.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.wsousa.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterInstancia() {
        return new MemoriaFabricaDeRepositorio();
//        return new MySQLFabricaDeRepositorio();
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();

}
