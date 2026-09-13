import com.wsousa.estoque.CadastroProduto;
import com.wsousa.estoque.Fabricante;
import com.wsousa.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(Produto::getFabricante));

        produtosPorFabricante.forEach((fabricante, produtosDoFabricante) -> {
            System.out.println();
            System.out.println(fabricante.nome());
            System.out.println("-------------");
            produtosDoFabricante.forEach(produto -> System.out.println(produto.getNome()));
        });
    }

}
