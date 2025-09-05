package lista03.exercicio01;

public class Porta {
    private String material;
    private String tipo;
    private String tamanho;

    public Porta(){}

    public Porta(String material, String tipo, String tamanho) {
        this.material = material;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void abrirPorta(){
        System.out.println("Porta aberta");
    }
    public void fecharPorta(){
        System.out.println("Porta fechada");
    }
}
