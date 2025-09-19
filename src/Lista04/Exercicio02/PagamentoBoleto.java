package Lista04.Exercicio02;


public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Boleto com código: " + codigoBoleto);
    }
}