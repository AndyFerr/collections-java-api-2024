package edu.dio.examples.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item i : carrinhoDeCompras){
            if (i.getNome().equalsIgnoreCase(nome)){
                carrinhoDeCompras.remove(i);
            }
        }
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : carrinhoDeCompras){
            valorTotal += (i.getPreco()*i.getQunantidade());
        }
        System.out.println("Valor total do carrinho: "+ valorTotal);
    }

    public void exibirItens(){
        for (Item i : carrinhoDeCompras){
            System.out.printf("Item: %s \nPreco: %.2f \nQuantidade: %d", i.getNome(), i.getPreco(), i.getQunantidade());

        }
    }

}
