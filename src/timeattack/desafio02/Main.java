package timeattack.desafio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(soma(pedePrimeiroNumero(), pedeSegundoNumero()));
    }

    public static int pedePrimeiroNumero(){
        Scanner scan = new Scanner(System.in);
        int primeiroNumero = scan.nextInt();
        return primeiroNumero;
    }

    public static int pedeSegundoNumero(){
        Scanner scan = new Scanner(System.in);
        int numeroDois = scan.nextInt();
        return numeroDois;
    }

    public static int soma(int numeroUm, int numeroDois){
        return numeroUm+numeroDois;
    }
}
