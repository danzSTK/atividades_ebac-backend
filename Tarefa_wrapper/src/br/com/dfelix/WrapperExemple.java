package br.com.dfelix;
import java.util.Scanner;

public class WrapperExemple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor como Wrapper: " + valorWrapper);

        scanner.close();
    }

}
