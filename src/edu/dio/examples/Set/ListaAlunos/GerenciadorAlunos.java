package edu.dio.examples.Set.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAlunos(String nome, long matricula, double nota){
        listaAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno A = null;
        for (Aluno a : listaAlunos){
            if (a.getMatricula() == matricula){
                A = a;
            }
            break;
        }
        listaAlunos.remove(A);
    }
//  Usa-se o TreeSet ao inves do
    public void exibirAlunoNome(){
        Set<Aluno> listaAlunoNome = new TreeSet<>(listaAlunos);
        System.out.println(listaAlunoNome);
    }

    public void exibirAluno(){
        System.out.println(listaAlunos);
    }

    public void exibirAlunoNota(){
        Set<Aluno> listaAlunoNota = new TreeSet<>(new ComparePorNota());
        listaAlunoNota.addAll(listaAlunos);
        System.out.println(listaAlunoNota);
    }



    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAlunos("Andrey", 123546, 10.0);
        gerenciadorAlunos.adicionarAlunos("Kefera", 856432, 9);
        gerenciadorAlunos.adicionarAlunos("Davi", 256413, 9.5);

        gerenciadorAlunos.exibirAluno();
        gerenciadorAlunos.exibirAlunoNome();
        gerenciadorAlunos.exibirAlunoNota();

    }
}
