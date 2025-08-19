package timeattack.desafio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        imprimeInfos(pedePrimeiroNome(),pedeSobrenome(),pedeIdade(),pedeFraseFavorita());
    }
    public static String pedePrimeiroNome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite seu primeiro nome:");
        String nome = scan.next();
        return nome;
    }

    public static String pedeSobrenome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite seu sobrenome:");
        String sobrenome = scan.next();
        return sobrenome;
    }

    public static int pedeIdade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite sua idade:");
        int idade = scan.nextInt();
        return idade;
    }
    public static String pedeFraseFavorita(){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite sua frase favorita:");
        String frase = scan.nextLine();
        return frase;
    }

    public static void imprimeInfos(String nome, String sobrenome, int idade, String frase){
        System.out.println("nome: "+nome);
        System.out.println("sobrenome: "+sobrenome);
        System.out.println("idade: " +idade);
        System.out.println("frase favorita: "+frase);
    }


}
