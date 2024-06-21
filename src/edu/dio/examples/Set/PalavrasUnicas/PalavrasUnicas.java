package edu.dio.examples.Set.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class PalavrasUnicas {
    private Set<String> palavrasUnicas;

    public PalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String p){
        palavrasUnicas.add(p);
    }

    public void removerPalavras(String p){
        palavrasUnicas.remove(p);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        PalavrasUnicas ListaDePalavrasUnicas = new PalavrasUnicas();

        ListaDePalavrasUnicas.adicionarPalavra("bottle of water");
        ListaDePalavrasUnicas.adicionarPalavra("computer");
        ListaDePalavrasUnicas.adicionarPalavra("samrtphone");

//        ListaDePalavrasUnicas.removerPalavras("computer");
        ListaDePalavrasUnicas.exibirPalavras();
        System.out.println(ListaDePalavrasUnicas.verificarPalavra("computer"));
    }

}
