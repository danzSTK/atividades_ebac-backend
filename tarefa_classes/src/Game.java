public class Game {

    private String nome;
    private int valor;
    private String distribuidora;

    /**
     *
     * @return nome do jogo que deve ser setado para armazenar
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return valor do jogo que deve ser do tipo int
     */
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }
}
