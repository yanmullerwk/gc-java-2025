package Lista04.Desafio06;


public abstract class Divida implements Negociavel {
    private String idCliente;
    private double valorOriginal;
    private int diasAtraso;

    public Divida(String idCliente, double valorOriginal, int diasAtraso) {
        this.idCliente = idCliente;
        this.valorOriginal = valorOriginal;
        this.diasAtraso = diasAtraso;
    }


    protected String getIdCliente() { return idCliente; }
    protected double getValorOriginal() { return valorOriginal; }
    protected int getDiasAtraso() { return diasAtraso; }


}
