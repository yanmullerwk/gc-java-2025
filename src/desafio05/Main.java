package desafio05;

public class Main {
    public static void main(String[] args) {
        ContaBancaria douglas = new ContaBancaria("douglas","123123123", "c4", "banco", "asdasd");
        ContaBancaria mercedes = new ContaBancaria("mercedes","1231233312", "c3", "banco", "asdasd");
        douglas.depositar(500);
        mercedes.depositar(500);
        douglas.realisarPix(10.5,mercedes);
        System.out.println(douglas.getHorarioAtual());
    }
}
