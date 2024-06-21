package edu.dio.examples.somaNumeros;
import java.util.ArrayList;
import  java.util.List;
public class SomaNumeros {
    private List<Integer> somaNumeros;

    public SomaNumeros() {
        this.somaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        somaNumeros.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;
        for (Integer i : somaNumeros){
            soma += i;
        }
        System.out.println("Soma: "+soma);
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Integer i:somaNumeros){
            if (i > maiorNumero){
                maiorNumero = i;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        for (Integer i:somaNumeros){
            if (i < menorNumero){
                menorNumero = i;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(somaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somanumeros = new SomaNumeros();

        somanumeros.adicionarNumero(10);
        somanumeros.adicionarNumero(25);
        somanumeros.adicionarNumero(56);

        somanumeros.exibirNumeros();

    }
}
