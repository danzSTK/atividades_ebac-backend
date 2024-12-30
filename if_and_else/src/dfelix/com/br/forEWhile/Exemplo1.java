package dfelix.com.br.forEWhile;

public class Exemplo1 {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 100; contador++) {
            if (contador % 5 != 0) {
                continue;
            }

            System.out.println("Esses são os multiples de 5: " + contador);
        }
    }
}
