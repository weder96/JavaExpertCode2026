package com.wsousa.cartaobeneficio.servico;

import com.wsousa.cartaobeneficio.Cartao;
import com.wsousa.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Depósito", valorDeposito);
    }

}
