public class App {
    public static void main(String[] args) {
        Game game = new Game();

        // setando os valores atraves dos métodos
        game.setNome("God Of War");
        game.setValor(250);
        game.setDistribuidora("Sony");

        // Mostrando valores setados no console
        System.out.println(game.getNome());
        System.out.println(game.getDistribuidora());
        System.out.println(game.getValor());
    }
}
