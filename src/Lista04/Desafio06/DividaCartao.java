package Lista04.Desafio06;


public class DividaCartao extends Divida {
    private String bandeira;

    public DividaCartao(String idCliente, double valorOriginal, int diasAtraso, String bandeira) {
        super(idCliente, valorOriginal, diasAtraso);
        this.bandeira = bandeira;
    }


    @Override
    public PropostaNegociacao negociar() {
        double valorBase = getValorOriginal();
        if (getDiasAtraso() <= 30) {
            double valorComDesconto = valorBase * 0.90;
            return new PropostaNegociacao(valorComDesconto, 1,
                    "Cartão: desconto de 10%  à vista. Bandeira: " + bandeira);
        } else {
            double valorComDesconto = valorBase * 0.95;
            return new PropostaNegociacao(valorComDesconto, 6,
                    "Cartão: desconto de 5% e parcelamento em 6x. Bandeira: " + bandeira);
        }
    }
}
