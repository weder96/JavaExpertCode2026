import com.wsousa.comercial.Cliente;
import com.wsousa.comercial.ServicoDeVenda;
import com.wsousa.comercial.Venda;

import java.util.*;

public class Principal2 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<Cliente> clientes = new ArrayList<>();
        for (Venda venda : vendas) {
            if (venda.isFechada() && !clientes.contains(venda.getCliente())) {
                clientes.add(venda.getCliente());
            }
        }
        clientes.sort(Comparator.comparing(Cliente::nome));

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

}
