package lista06.exercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SistemaAlunos {

    private Set<String> alunos;
    private Scanner scanner;

    public SistemaAlunos() {
        alunos = new HashSet<>();
        scanner = new Scanner(System.in);
    }

    public void menu() {

        while (true) {

            System.out.println("=======================");
            System.out.println(" Bem-vindo ao sistema de alunos ");
            System.out.println("=======================");
            System.out.println(" 1. Cadastrar Alunos");
            System.out.println(" 2. Verificar Aluno");
            System.out.println(" 0. Sair");
            System.out.println("=======================");
            System.out.print(" Digite uma opção: ");
            System.out.println();

            int opcao;

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Opção inválida! Digite apenas números.");
                System.out.println();
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarAlunos();
                    break;

                case 2:
                    verificarAlunos();
                    break;

                case 0:
                    System.out.println(" Encerrando o sistema...");
                    return;

                default:
                    System.out.println(" Opção inválida, tente novamente.");
            }

            System.out.println();
        }
    }

    private void cadastrarAlunos() {

        System.out.println();
        System.out.println(" ===== Cadastro de Alunos ===== ");
        System.out.println();

        while (true) {

            System.out.print(" Digite o nome do aluno (ou 0 para sair): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("0")) {
                System.out.println(" Saindo do cadastro...");
                System.out.println();
                break;
            }

            if (entrada.isEmpty()) {
                System.out.println(" Nome não pode ser vazio!");
                System.out.println();
                continue;
            }

            alunos.add(entrada);
            System.out.println(" Aluno '" + entrada + "' cadastrado com sucesso!");
            System.out.println();
        }
    }

    private void verificarAlunos() {

        System.out.println();
        System.out.println(" ===== Verificação de Alunos ===== ");
        System.out.println();

        if (alunos.isEmpty()) {
            System.out.println(" Não existem alunos cadastrados.");
            System.out.println();
            return;
        }

        while (true) {
            System.out.print(" Digite o nome do aluno (ou 0 para voltar): ");
            String aluno = scanner.nextLine();

            if (aluno.equals("0")) {
                System.out.println(" Voltando ao menu...");
                System.out.println();
                break;
            }

            if (alunos.contains(aluno)) {
                System.out.println(" O nome '" + aluno + "' está na lista!");
            } else {
                System.out.println(" O nome '" + aluno + "' não está na lista!");
            }

            System.out.println();
        }
    }
}
