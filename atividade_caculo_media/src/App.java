public class App {

    public static void main(String args[]) {
        Notas notasDoDaniel = new Notas();

        notasDoDaniel.setN1(6);
        notasDoDaniel.setN2(8);
        notasDoDaniel.setN3(5);
        notasDoDaniel.setN4(9);
        notasDoDaniel.calculaMedia();

        System.out.println("***Resultado***");
        System.out.println(notasDoDaniel.getMedia());
        System.out.println("**************");
    }
}
