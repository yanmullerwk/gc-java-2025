package lista03.exercicio02;

public class Carro {
    private String placa;
    private String modelo;
    private String ano;
    private String cor;
    private String carroceria;

    public Carro(){}
    public Carro(String placa, String modelo, String ano, String cor, String carroceria){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.carroceria = carroceria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String exibirDados(){
        return "Placa: "+this.getPlaca()+"Modelo: "+this.getModelo()+"Ano: "+this.getAno()+"Cor: "+this.getCor()+"Carroceria: "+this.getCarroceria();
    }
}
