import br.wsousa.carrinho.CarrinhoDeCompras;
import br.wsousa.produtos.ProdutoDigital;
import br.wsousa.produtos.ProdutoFisico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setSkul("D001");
        produtoDigital.setNome("Curso de Java");
        produtoDigital.setPreco(100.00);

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setSkul("F001");
        produtoFisico.setNome("Teclado");
        produtoFisico.setPreco(150.00);
        produtoFisico.setPesoKg(0.8);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(produtoDigital);
        carrinho.adicionarProduto(produtoFisico,2);

        carrinho.exibirResumo();
    }

}