package Lista04.Desafio06;


public class DividaEmprestimo extends Divida {

    private String instituicao;


    public DividaEmprestimo(String idCliente, double valorOriginal, int diasAtraso, String instituicao) {
        super(idCliente, valorOriginal, diasAtraso);
        this.instituicao = instituicao;
    }


    @Override
    public PropostaNegociacao negociar() {
        double taxaMes = 0.008;
        int meses = 12;
        double valorFinal = getValorOriginal() * (1 + taxaMes * meses); // juros simples p/ didática
        return new PropostaNegociacao(valorFinal, meses,
                "Empréstimo: 12x com juros simples de 0,8% a.m. (" + instituicao + ")");
    }
}
