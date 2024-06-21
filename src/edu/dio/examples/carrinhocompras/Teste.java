package edu.dio.examples.carrinhocompras;

public class Teste{
    public static void main(String[] args) {
        CarrinhoDeCompras shoppingCart = new CarrinhoDeCompras();

        shoppingCart.adicionarItem("Margarina Primor", 3.49,1);
        shoppingCart.adicionarItem("Ovos tipo medio", 17.49,2);

        shoppingCart.removerItem("Margarina primor");
        shoppingCart.calcularValorTotal();
        shoppingCart.exibirItens();
    }
}
