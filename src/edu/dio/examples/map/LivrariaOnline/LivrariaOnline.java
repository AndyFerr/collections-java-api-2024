package edu.dio.examples.map.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livrariaOnline;

    public LivrariaOnline() {
        this.livrariaOnline = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrariaOnline.put(link, new Livro(titulo, autor, preco));
    }

//    public void exibirLivrosOrdenadosPorPreco(){
//        List<Map.Entry<String, Livro>> livroList = new ArrayList<>(livrariaOnline.entrySet());
//
//        Collections.sort(livroList), new ComparatorPorPreco();
//
//
//    }
}
