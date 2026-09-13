import com.wsousa.estoque.CadastroProduto;
import com.wsousa.estoque.Categoria;
import com.wsousa.estoque.Produto;

import java.util.List;

import static java.util.stream.Collectors.*;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .toList();
//                .collect(toUnmodifiableList());

//        categorias.remove(0);

        System.out.println(categorias);
    }

}
