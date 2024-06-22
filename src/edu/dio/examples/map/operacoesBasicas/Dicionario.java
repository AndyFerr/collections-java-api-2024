package edu.dio.examples.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String p, String d){
        dicionario.put(p, d);
    }

    public void removerPalavra(String p){
        dicionario.remove(p);
    }

    public Map<String, String> exibirPalavras(){
        return dicionario;
    }

    public String pesquisarPalavras(String p){
        String definicao = null;
        if (dicionario.containsKey(p)){
            definicao = dicionario.get(p);
        }
        return definicao;
    }



    public static void main(String[] args) {
        Dicionario dicionario1 = new Dicionario();

        dicionario1.adicionarPalavra("cadeira", "Objeto para se sentar");
        dicionario1.adicionarPalavra("cama", "Objeto para se deitar");
        System.out.println(dicionario1.exibirPalavras());
//        dicionario1.removerPalavra("cadeira");
//        System.out.println(dicionario1.exibirPalavras());
//        System.out.println(dicionario1.pesquisarPalavras("cama"));

    }
}
