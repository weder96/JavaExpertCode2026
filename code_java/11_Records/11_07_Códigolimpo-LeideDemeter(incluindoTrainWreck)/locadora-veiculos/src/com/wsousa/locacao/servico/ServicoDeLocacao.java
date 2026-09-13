package com.wsousa.locacao.servico;

import com.wsousa.locacao.Locacao;
import com.wsousa.locacao.Veiculo;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao) {
//        double totalDiarias = locacao.getVeiculo().getGrupo().getValorDiaria()
//                * locacao.getQuantidadeDiarias();

//        double totalDiarias = locacao.getValorDiaria()
//                * locacao.getQuantidadeDiarias();

        double totalDiarias = locacao.calcularTotalDiarias();

        // TODO realiza lógica para registrar locação pelo valor das diárias

//        locacao.getVeiculo().setDisponivel(false);
        locacao.reservarVeiculo();
    }

}
