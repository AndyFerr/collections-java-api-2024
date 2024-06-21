package edu.dio.examples.List.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

//    cria um arraylist chamado "tarefaList" que recebe objetos da classe Tarefa
    private List<Tarefa> tarefaList;

    // Constructor that everytime that occurs an instantiation of a ListaTarefa object it will create a new empty arraylist that will recieve Tarefa objects
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Method to add a description that will be instantiated as a Tarefa object and added to the empy arraylist that had been created before
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // Recebe uma String
    // Compara essa String com a descrição dos objetos de tarefaList
    // Pega os objetos cuja descrição forem iguais ao parâmetro passado e adiciona em "tarefasParaRemover"
    // Usa o removeAll para remover todas os elementos de tarefasParaRemover de tarefaList
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for( Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

}
