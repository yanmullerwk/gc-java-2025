package lista01.exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota = recebeNota(scan);
        System.out.println(verificaNota(nota));
        scan.close();
    }

    public static int recebeNota(Scanner scan){
        System.out.println("digite sua nota:");
        return scan.nextInt();
    }
    public static String verificaNota(int nota){
        if(nota<6){
            return "reprovado";
        }else if(nota >= 6 && nota <= 10){
            return "aprovado";
        }else{
            return "nota invalida";
        }
    }
}
