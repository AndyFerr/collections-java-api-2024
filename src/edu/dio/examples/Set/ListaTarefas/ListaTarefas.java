package edu.dio.examples.Set.ListaTarefas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa T = null;
        for (Tarefa t : listaTarefa){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                T = t;
            }
            break;
        }
        listaTarefa.remove(T);
    }

    public Set<Tarefa> exibirTarefas(){
        return listaTarefa;
    }

    public int contarTarefas(){
        return listaTarefa.size();
    }

    public void  limparListaTarefas(){
        listaTarefa.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Trabalhar");
        listaTarefas.adicionarTarefa("Tomar banho");
        listaTarefas.removerTarefa("Trabalhar");
        System.out.println(listaTarefas.exibirTarefas());
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.limparListaTarefas();
        System.out.println(listaTarefas.exibirTarefas());

    }
}
