package com.wsousa.comercial.repositorio.memoria;

import com.wsousa.comercial.repositorio.FabricaDeRepositorio;
import com.wsousa.comercial.repositorio.VendaRepositorio;

public class MemoriaFabricaDeRepositorio implements FabricaDeRepositorio {

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MemoriaVendaRepositorio();
    }

    @Override
    public void close() {
    }

}
