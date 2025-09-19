package Lista04.Desafio06;


public class PropostaNegociacao {

    private final double valorFinal;
    private final int numeroParcelas;
    private final String observacao;


    public PropostaNegociacao(double valorFinal, int numeroParcelas, String observacao) {
        this.valorFinal = valorFinal;
        this.numeroParcelas = numeroParcelas;
        this.observacao = observacao;
    }


    public double getValorFinal() { return valorFinal; }
    public int getNumeroParcelas() { return numeroParcelas; }
    public String getObservacao() { return observacao; }


    @Override
    public String toString() {
        return "Valor final: "+getValorFinal()+"\n"+"Parcelas: "+getNumeroParcelas()+"\n"+"Obs: "+getObservacao();
    }
}