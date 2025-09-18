package lista02.desafio04;

import java.util.Scanner;

public class Main {
    // usei metodo pronto tou cansado
    public static void main(String[] args) {
        iniciarPrograma();
    }

    public static void iniciarPrograma() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            String escolha = scan.nextLine();

            if (escolha.equalsIgnoreCase("n")) {
                System.out.println("Programa encerrado!");
                break;
            }

            double num1 = 0, num2 = 0;

            if (escolha.equals("6")) {
                System.out.println("Digite o número:");
                num1 = scan.nextDouble();
                scan.nextLine();
            } else {
                System.out.println("Digite o primeiro número:");
                num1 = scan.nextDouble();

                System.out.println("Digite o segundo número:");
                num2 = scan.nextDouble();
                scan.nextLine();
            }

            switch (escolha) {
                case "1":
                    System.out.println("Resultado = " + soma(num1, num2));
                    break;
                case "2":
                    System.out.println("Resultado = " + subtracao(num1, num2));
                    break;
                case "3":
                    System.out.println("Resultado = " + multiplicacao(num1, num2));
                    break;
                case "4":
                    System.out.println("Resultado = " + divisao(num1, num2));
                    break;
                case "5":
                    System.out.println("Resultado = " + exponenciacao(num1, num2));
                    break;
                case "6":
                    System.out.println("Raiz quadrada de " + num1 + " = " + raizQuadrada(num1));
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scan.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n=== CALCULADORA ;) ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Exponenciação");
        System.out.println("6 - Raiz Quadrada");
        System.out.print("Escolha uma opção ou digite n para sair: ");
    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static String divisao(double a, double b) {
        if (b != 0) {
            return String.valueOf(a / b);
        } else {
            return "Erro: divisão por zero!";
        }
    }

    public static double exponenciacao(double a, double b) {
        return Math.pow(a, b);
    }

    public static double raizQuadrada(double a) {
        return Math.sqrt(a);
    }
}
