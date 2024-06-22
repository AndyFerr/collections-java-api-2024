package edu.dio.examples.map.LivrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String titutlo;
    private String autor;
    private double preco;

    public Livro(String titutlo, String autor, double preco) {
        this.titutlo = titutlo;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }
}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
}
