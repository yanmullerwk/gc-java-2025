package Lista04.Exercicio02;

public class Main {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        Pagamento pagamentoCartao = new PagamentoCartao("João Silva");
        Pagamento pagamentoBoleto = new PagamentoBoleto("123456789");

        processar(pagamentoCartao);
        processar(pagamentoBoleto);
    }

    private static void processar(Pagamento pagamento) {
        pagamento.processarPagamento();
    }
}

