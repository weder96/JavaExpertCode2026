import com.wsousa.comercial.Cliente;
import com.wsousa.comercial.ServicoDeVenda;
import com.wsousa.comercial.Venda;

import java.util.List;
import java.util.stream.Collectors;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .map(Cliente::nome)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(clientes);
    }
}
