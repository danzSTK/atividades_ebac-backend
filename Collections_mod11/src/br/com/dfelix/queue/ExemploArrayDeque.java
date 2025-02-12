package br.com.dfelix.queue;

import java.util.HashSet;
import java.util.Set;

public class ExemploArrayDeque {
    public static void main(String args[]) {
        exemploNovo();
    }

    private static void exemploNovo() {
        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        System.out.println(inteiros);
    }
}
