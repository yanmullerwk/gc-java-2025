package lista03.exercicio03;

import lista03.exercicio02.Carro;

public class Concessionaria {
    private String nome;
    private Carro[] cars;

    public Concessionaria(String nome, Carro[] carros) {
        this.nome = nome;
        this.cars = new Carro[10];
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addCarro(Carro car, int i){
        this.cars[i] = car;
    }
}
