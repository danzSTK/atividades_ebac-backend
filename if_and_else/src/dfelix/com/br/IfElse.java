package dfelix.com.br;

import java.util.Scanner;

public class IfElse {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = s.next();

        System.out.println("Digite sua idade");
        int idade = s.nextInt();

        System.out.println("Digite sua altura");
        double altura = s.nextDouble();

        if (idade >= 18) {
            System.out.println("Você já pode beber hein kkk");
        } else if (idade < 18 && idade > 15) {
            System.out.println("Seu papai tá sabendo que você gosta de homens?");
            if (altura > 1.75) {
                System.out.println("Você é alto hein");
            }
        } else {
            System.out.println("Resultado maior que 10");
        }
    }
}
