package br.wsousa.carrinho;

import br.wsousa.produtos.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;


    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        adicionarProduto(produto, 1);
    }

    public void adicionarProduto(Produto produto, int quantidade){
        ItemCarrinho novoItem = new ItemCarrinho(produto, quantidade);
        itens.add(novoItem);
    }

    public void removerPorSku(String sku){
        Iterator<ItemCarrinho> iterator = itens.iterator();

        //O iterator vai percorrer a lista até finalizar os objetos dentro dela
        while(iterator.hasNext()){
            ItemCarrinho item = iterator.next(); //Irá passar para o proximo item se ele existir

            if(item.getProduto().getSkul().equals(sku)){
                // Será realizado a verificação atraves do skul do produto e se for igual o mesmo será removido
                iterator.remove();
            }
        }
    }


    public double calcularSubtotal() {
        double total = 0;
        /* Utilizando o loop for each para iterar em coleções como list,
        * pegando assim o subtotal de cada produto e somando dentro do total.  */
        for (ItemCarrinho item : itens) {
           total += item.getSubTotal();
        }
        return total;
    }

    public double calcularTotalComFreteEOperacao(){
        double total = calcularSubtotal();
        for (ItemCarrinho item: itens){
            total += item.getCustoOperacional();
        }
        return total;
    }

    public void exibirResumo(){
        for (ItemCarrinho item: itens){
            System.out.println("Produto: " + item.getProduto().getNome());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Subtotal: R$ " + item.getSubTotal());
            System.out.println("Custo Operacional: R$ " + item.getCustoOperacional());
            System.out.println("--------------------------------------------------");
        }
    }
}
