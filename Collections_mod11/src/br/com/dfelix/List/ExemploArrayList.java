package br.com.dfelix.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemCrescente();
        exemploNumeros();
        exemploAlunos();
        exemploComparaNotas();
    }

    public static void exemploAlunos () {
        System.out.println("******** Exemplo Alunos ********");
        List<Aluno> alunos = new ArrayList<Aluno>();

        Aluno a = new Aluno("Daniel Felix", "FullStack", 0.0);
        Aluno b = new Aluno("Beatriz Soares", "Design", 0.0);
        Aluno c = new Aluno("Joao Matheus", "Python", 0.0);
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        Collections.sort(alunos);
        System.out.println(alunos);
        System.out.println("");
    }

    //excalidraw.com
    //ntp
    private static void exemploNumeros() {
        System.out.println("******* Exemplo Números *******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);
    }

    private static void exemploListaSimples() {
        List<String> lista =  new ArrayList<String>();
        lista.add("Daniel Felix");
        lista.add("Beatriz Soares");
        lista.add("Carlos Louco");
        System.out.println(lista);
        lista.remove("Carlos Louco");
        System.out.println(lista);
    }

    private static void exemploListaSimplesOrdemCrescente() {
        System.out.println("*****Exemplo Ordernado*****");
        List<String> lista =  new ArrayList<String>();
        lista.add("Daniel Felix");
        lista.add("Beatriz Soares");
        lista.add("Carlos Louco");
        Collections.sort(lista);
        System.out.println(lista);
    }

    private static void exemploComparaNotas() {
        System.out.println("********* Exemplo compara nota *******");
        List<Aluno> alunos = new ArrayList<Aluno>();
        Aluno a = new Aluno("Daniel Felix", "FullStack", 20.0);
        Aluno b = new Aluno("Beatriz", "Design", 30.0);
        Aluno c = new Aluno("Joao Matheus", "Python", 10.0);

        alunos.add(a);
        alunos.add(b);
        alunos.add(c);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(alunos,comparaNotaAluno);
        System.out.println("Lista com a ordenaçao por nota: " + alunos);

    }

}
