package Lista04.Desafio06;

public class Main {
    public static void main(String[] args) {
        init();
    }

    private static void init() {

        Divida cartao = new DividaCartao("CLI-001", 1000.00, 30, "Visa");
        Divida emprestimo = new DividaEmprestimo("CLI-002", 8000.00, 60, "Banco BRB");

        NegociadorDeDividas negociador = new NegociadorDeDividas();

        PropostaNegociacao propCartao = negociador.aplicar(cartao);
        PropostaNegociacao propEmprestimo = negociador.aplicar(emprestimo);

        System.out.println("Proposta do cartão: " + propCartao);
        System.out.println("Proposta de emprestim: " + propEmprestimo);
    }
}