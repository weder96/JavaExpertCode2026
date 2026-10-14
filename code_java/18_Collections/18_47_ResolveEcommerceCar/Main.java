import br.edu.DominioProdutos.ProdutoDigital;
import br.edu.DominioProdutos.ProdutoFisico;
import br.edu.EstruturaCarrinho.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        ProdutoDigital produto1 = new ProdutoDigital();
        ProdutoFisico produto2 = new ProdutoFisico();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        produto1.setSku("159785");
        produto1.setNome("Pão");
        produto1.setPreco(5.90);

        produto2.setSku("865145");
        produto2.setNome("Peixe");
        produto2.setPreco(6.50);

        carrinho.adicionarProduto(produto1, 5);
        carrinho.adicionarProduto(produto2, 2);

        carrinho.exibirResumo();
        System.out.println("subtotal: " + carrinho.calcularSubtotal());

        carrinho.removerPorSku("865145");

        carrinho.exibirResumo();
    }
}
