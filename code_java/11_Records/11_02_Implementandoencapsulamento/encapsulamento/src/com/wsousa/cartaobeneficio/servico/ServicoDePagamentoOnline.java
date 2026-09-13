package com.wsousa.cartaobeneficio.servico;

import com.wsousa.cartaobeneficio.Cartao;
import com.wsousa.cartaobeneficio.Estabelecimento;
import com.wsousa.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }

}
