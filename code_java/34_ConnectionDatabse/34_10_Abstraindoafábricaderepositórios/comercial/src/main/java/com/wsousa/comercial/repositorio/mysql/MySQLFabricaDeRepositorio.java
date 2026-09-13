package com.wsousa.comercial.repositorio.mysql;

import com.wsousa.comercial.repositorio.FabricaDeRepositorio;
import com.wsousa.comercial.repositorio.PersistenciaException;
import com.wsousa.comercial.repositorio.VendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLFabricaDeRepositorio implements FabricaDeRepositorio {

    private final Connection conexao;

    public MySQLFabricaDeRepositorio() {
        try {
            this.conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/comercial", "root", "");
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MySQLVendaRepositorio(conexao);
    }

    @Override
    public void close() {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }

}
