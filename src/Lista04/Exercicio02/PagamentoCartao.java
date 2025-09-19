package Lista04.Exercicio02;

public class PagamentoCartao implements Pagamento {
    private String nomeDoTitular;

    public PagamentoCartao(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Cartão para o titular: " + nomeDoTitular);
    }
}
