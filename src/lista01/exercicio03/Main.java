package lista01.exercicio03;

import java.util.Scanner;

public class Main {
    /*Crie uma constante para armazenar um salário base.
    Leia a quantidade de horas extras trabalhadas.
    Considere que cada hora extra vale R$ 50,00.
    Calcule e exiba o salário total do funcionário.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double SALARIO_BASE = 5000.00;
        final double SALARIO_HORA_EXTRA = 50.00;

        System.out.printf("Quantas horas extras você trabalhou?");
        int horasExtras = scan.nextInt();
        double salarioTotal = SALARIO_BASE + (SALARIO_HORA_EXTRA * horasExtras);

        System.out.println("Você trabalhou um total de: "+horasExtras+" horas extras, o seu salário total é de R$"+salarioTotal);
    }

}
