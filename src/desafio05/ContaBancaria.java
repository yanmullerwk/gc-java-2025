package desafio05;

import java.time.LocalDateTime;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorDaConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;


    public ContaBancaria(String nome, String cpf, String identificadorDaConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorDaConta = identificadorDaConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificadorDaConta() {
        return identificadorDaConta;
    }

    public void setIdentificadorDaConta(String identificadorDaConta) {
        this.identificadorDaConta = identificadorDaConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    private void recebeSaldo(double valor) {
        saldo += valor;
    }

    public LocalDateTime getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual() {
        this.horarioAtual = LocalDateTime.now();
    }

    public void sacar(double valorDoSaque){
        if(valorDoSaque < 0){
            System.out.println("Erro: O valor do saque necessita ser maior que 0 (Zero)");
        }
        if(valorDoSaque > this.saldo){
            System.out.println("Erro: Saldo insuficiente");
            return;
        }
        this.saldo -= valorDoSaque;
        System.out.printf("Saque realizado seu saldo atual é de: R$%.2f%n",this.getSaldo());
    }

    public void depositar(double valorDoDeposito){
        this.saldo += valorDoDeposito;
        System.out.printf("Deposito realizado no valor de R$%.2f%n",valorDoDeposito," seu saldo atual é de: R$%.2f",this.getSaldo());
    }

    public void realisarPix(double valorPix, ContaBancaria contaBancaria){
        if(valorPix > this.saldo){
            System.out.println("Erro: Saldo insuficiente");
        }
        this.saldo -= valorPix;
        contaBancaria.recebeSaldo(valorPix);
        System.out.printf("%s enviou R$%.2f para %s. Saldo atual de: R$%.2f%n", this.getNome() , valorPix, contaBancaria.getNome(), this.getSaldo());
    }

    public LocalDateTime verificaHorarioAtual(){
        setHorarioAtual();
        LocalDateTime horarioAtual = getHorarioAtual() ;
        return horarioAtual;
    }

    

}
