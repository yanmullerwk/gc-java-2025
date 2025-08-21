package lista01.exercicio04;

import java.util.Scanner;

public class Main {
    /*
    * Criar um programa que receba uma temperatura em Celsius e
    * converta para Fahrenheit.
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma temperatura em Celsius:");
        double temperatura = scan.nextDouble();
        System.out.println("A temperatura de "+temperatura+"C em Fahrenheit é: "+converteEmFahrenheit(temperatura));

    }

    public static double converteEmFahrenheit(double temperatura) {
        return (temperatura * 1.8) + 32;
    }
}
