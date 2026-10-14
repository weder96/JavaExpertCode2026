package br.edu.EstruturaCarrinho;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import br.edu.DominioProdutos.*;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        itens.add(new ItemCarrinho(produto,0));
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(new ItemCarrinho(produto,quantidade));
    }

    public void removerPorSku(String sku) {
        Iterator<ItemCarrinho> it = itens.iterator();
        while (it.hasNext()) {
            ItemCarrinho i = it.next();
            if(i.getProduto().equals(sku)) {
                it.remove();
            }
        }
    }

    public double calcularSubtotal() {
        Iterator<ItemCarrinho> it = itens.iterator();
        double sub = 0;
        while (it.hasNext()) {
            ItemCarrinho i = it.next();
            sub += i.getSubtotalItem();
        }
        return sub;
    }

    public double calcularTotalComFreteEOperacao() {
        Iterator<ItemCarrinho> it = itens.iterator();
        double sub = 0;
        while (it.hasNext()) {
            ItemCarrinho i = it.next();
            sub += i.getSubtotalItem();
        }
        return sub;
    }

    public void exibirResumo() {
        Iterator<ItemCarrinho> it = itens.iterator();
        int in = 1;
        while (it.hasNext()) {
            ItemCarrinho i = it.next();
            System.out.println("produto " + in);
            System.out.println("sku: " + i.getProduto().getSku());
            System.out.println("nome: " + i.getProduto().getNome());
            System.out.println("preço: R$" + i.getProduto().getPreco());
            System.out.println("quantidade: " + i.getQuantidade());
            System.out.println("\n\n");
            in++;
        }
    }
}
