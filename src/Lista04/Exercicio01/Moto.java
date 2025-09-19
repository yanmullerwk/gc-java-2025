package Lista04.Exercicio01;


public class Moto extends Veiculo {

    private String tipoDeGuidao;

    public Moto(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano); // chama o construtor da classe base
        this.tipoDeGuidao = tipoDeGuidao;
    }


    @Override
    public String toString() {
        return super.toString() + "tipoDeGuidao: " + tipoDeGuidao;
    }
}
