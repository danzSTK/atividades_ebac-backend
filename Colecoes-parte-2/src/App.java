package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                masculinos.add(nome);
            } else if (sexo.equals("F")) {
                femininos.add(nome);
            } else {
                System.out.println("Entrada inválida. Por favor, digite 'M' para masculino ou 'F' para feminino ");
            }
        }

        scanner.close();

        System.out.println("Lista de pessoas do gênero masculino: ");
        for (String nome : masculinos) {
            System.out.println("- " + nome);
        }

        System.out.println("Lista de pessoas do gênero feminino: ");
        for (String nome : femininos) {
            System.out.println("- " + nome);
        }
    }
}
