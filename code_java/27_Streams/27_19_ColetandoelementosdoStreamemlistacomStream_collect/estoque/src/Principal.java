import com.wsousa.estoque.CadastroProduto;
import com.wsousa.estoque.Categoria;
import com.wsousa.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//                .collect(() -> new ArrayList<>(),
//                        (lista, elemento) -> lista.add(elemento),
//                        (lista1, lista2) -> lista1.addAll(lista2));
        System.out.println(categorias);
    }

}
