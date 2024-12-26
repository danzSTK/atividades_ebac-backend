public class VariaveisExemplo {

    private int codigo = 1;
    private long codigoMaior = 1234567890;
    private double valorDecimal2 = 10.010;
    private String texto = "String";
    private boolean status = false;

    private float valorDecimal = 10.1f; //Veja o destaque do f
    private short shor;
    private byte bi;

    public String retornaTexto() {
        return "Daniel, Daniel";
    }

    public int retornaUmInteiro() {
        return 10;
    }

    public long retornaLong(long num) {
        return num;
    }
}
