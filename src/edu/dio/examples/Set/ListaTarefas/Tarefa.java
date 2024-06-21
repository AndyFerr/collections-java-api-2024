package edu.dio.examples.Set.ListaTarefas;

public class Tarefa {

    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
