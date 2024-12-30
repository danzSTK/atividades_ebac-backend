package dfelix.com.br.forEWhile;

import java.util.Scanner;

public class TabuadaExemple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número?");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite o número ao qual você quer a tabuada:");
            int valor = s.nextInt();
            for(int i = 0; i <= 10; i++) {
                System.out.println(valor + " x " + i + " = " + valor*i);
            }

            System.out.println("Deseja gerar outra tabuada? sim ou não ");
            resposta = s.next();
        }

        System.out.println("Obrigado.");
    }
}
