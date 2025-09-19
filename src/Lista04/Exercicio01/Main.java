package Lista04.Exercicio01;

public class Main {
    public static void main(String[] args) {
        init(); // ponto de entrada, chama a função principal
    }

    private static void init() {
        //meu carro favorito
        Veiculo carro = new Carro("Bruik", "riviera", 1972, 2);
        Veiculo moto = new Moto("voltz", "ev1 sport", 2020, "Esportivo");

        exibirInformacoes(carro);
        exibirInformacoes(moto);
    }


    private static void exibirInformacoes(Veiculo veiculo) {
        System.out.println(veiculo.toString());
    }
}

