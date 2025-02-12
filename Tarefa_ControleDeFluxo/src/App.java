import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Notas notasUser = new Notas();
        App app = new App();

        System.out.println("Olá, gostaria de saber se foi aprovado ou não?");
        String singIn = s.next();

        while (singIn.equalsIgnoreCase("sim")) {
            System.out.println("********************");
            System.out.println("Abaixo digite a nota do primeiro bimestre:");
            notasUser.setN1(s.nextInt());
            System.out.println("Agora digite a nota do segundo bimestre: ");
            notasUser.setN2(s.nextInt());
            System.out.println("Agora digite a nota do terceiro bimestre: ");
            notasUser.setN3(s.nextInt());
            System.out.println("Por fim, digite a nota do quarto bimestre: ");
            notasUser.setN4(s.nextInt());
            System.out.println("--------------------");
            System.out.println("Então suas notas foram: B1: " + notasUser.getN1() + " B2: " + notasUser.getN2() + " B3: " + notasUser.getN3() + " B4: " + notasUser.getN4());
            System.out.println("--------------------");
            System.out.println("Sua média foi: " + notasUser.calculaMedia());
            System.out.println(app.getMensage(notasUser.calculaMedia()));
            System.out.println("********************");
            System.out.println("Gostaria de saber sua média novamente?");
            singIn = s.next();
        }

        System.out.println("Até a próxima!");


    }
    public String getMensage(Double media) {
        if(media >= 7) {
            return "Uau! Parabéns você está aprovado";
        } else if (media >= 5) {
            return "Ihh! Você pode melhorar isso hein. Ficou de recuperação";
        } else if (media < 5) {
            return "Aff! Você está reprovado... Sinto muito :(";
        } else return "Por favor, digite notas entre 0 e 10";
    }
}
