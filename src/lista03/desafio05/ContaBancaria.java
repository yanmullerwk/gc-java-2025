package lista03.desafio05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorDaConta;
    private String banco;
    private String endereco;
    private double saldo;
    private boolean isContaAtiva;
    private LocalDateTime horaCriacaoDaConta;
    public static final int TAXA_MENSAL = 20;
    public static final double TAXA_DE_JUROS = 0.1;

    public ContaBancaria(String nome, String cpf, String identificadorDaConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorDaConta = identificadorDaConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0;
        this.horaCriacaoDaConta = LocalDateTime.now();
        this.isContaAtiva = true;
    }

    private boolean verificarContaAtiva() {
        if (!isContaAtiva) {
            System.out.println("Erro: Conta não está ativa.");
            return false;
        }
        return true;
    }

    public void saque(double valor) {
        if (!verificarContaAtiva()) return;

        if (saldo < valor) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public void depositar(double valor) {
        if (!verificarContaAtiva()) return;

        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void pix(double valor, ContaBancaria conta) {
        if (!verificarContaAtiva()) return;

        if (saldo < valor) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }
        this.saldo -= valor;
        conta.depositar(valor);
        System.out.println("Pix de R$" + valor + " enviado com sucesso para " + conta.nome);
    }

    public void transferencia(double valor, ContaBancaria conta) {
        if (!verificarContaAtiva()) return;

        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(8, 0);
        LocalTime end = LocalTime.of(19, 0);

        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }


        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Erro: Transferência fora do horário bancário (08h às 19h).");
            return;
        }

        this.saldo -= valor;
        conta.depositar(valor);
        System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + conta.nome);
    }

    public void verificaHorario() {
        if (!verificarContaAtiva()) return;

        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(formatoHora);
        System.out.println("A hora atual é: " + horaFormatada);
    }

    public void verificaSaldo() {
        if (!verificarContaAtiva()) return;

        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public void mostraInformcao() {
        if (!verificarContaAtiva()) return;

        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Identificador da Conta: " + this.identificadorDaConta);
        System.out.println("Banco: " + this.banco);
        System.out.println("Endereço: " + this.endereco);
    }

    public void alteraEndereco(String endereco) {
        if (!verificarContaAtiva()) return;

        this.endereco = endereco;
        System.out.println("Endereço atualizado com sucesso.");
    }

    public void aplicaTaxaManutencaoMensal() {
        if (!verificarContaAtiva()) return;

        if (saldo >= TAXA_MENSAL) {
            saldo -= TAXA_MENSAL;
            System.out.println("Taxa de manutenção de R$" + TAXA_MENSAL + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente para aplicar a taxa de manutenção.");
        }
    }

    public void verificarDataEAplicarTaxa() {
        if (!verificarContaAtiva()) return;

        LocalDate hoje = LocalDate.now();
        if (hoje.getDayOfMonth() == 1) {
            aplicaTaxaManutencaoMensal();
        }
    }

    public void aplicarJurosMensal() {
        if (!verificarContaAtiva()) return;

        double jurosArrecadados = saldo * TAXA_DE_JUROS;
        if (jurosArrecadados != 0) {
            saldo += jurosArrecadados;
            System.out.println("Juros de R$" + jurosArrecadados + " aplicados.");
        }
    }

    public void fecharConta() {
        if (!verificarContaAtiva()) return;

        this.isContaAtiva = false;
        this.saldo = 0;
        System.out.println("Conta encerrada com sucesso.");
    }
}





