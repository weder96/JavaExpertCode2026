import com.wsousa.estoque.CadastroProduto;
import com.wsousa.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<String, Integer> estoque = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.toMap(Produto::getNome, Produto::getQuantidade));
//                .collect(Collectors.toMap(produto -> produto.getNome(),
//                        produto -> produto.getQuantidade()));

        System.out.println(estoque);
    }

}
