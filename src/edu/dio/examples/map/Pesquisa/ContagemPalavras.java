package edu.dio.examples.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String p, Integer o){
        contagemPalavras.put(p, o);
    }

    public void removerPalavra(String p){
        contagemPalavras.remove(p);
    }

    public Map<String, Integer> exibirContagemPalavras(){
        return contagemPalavras;
    }

    public void encontrarPalavraMaisFrequente(){
        Set<String> chaves = contagemPalavras.keySet();
        Integer maiorFrequencia = 0;
        String palavra = null;
        for (String p : chaves){
            if (contagemPalavras.get(p) > maiorFrequencia){
                maiorFrequencia = contagemPalavras.get(p);
                palavra = p;
            }
        }
        System.out.printf("Palavra : %s\nFrquencia: %d", palavra, maiorFrequencia);
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("Batata", 20);
        contagem.adicionarPalavra("Picles", 21);
        contagem.adicionarPalavra("Beterraba", 25);

        contagem.encontrarPalavraMaisFrequente();
    }
}
