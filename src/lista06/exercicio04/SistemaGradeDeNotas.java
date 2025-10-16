package lista06.exercicio04;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaGradeDeNotas {
    private HashMap<String, Double> notas;
    private Scanner scan;

    public SistemaGradeDeNotas() {
        scan = new Scanner(System.in);
        notas = new HashMap<>();
    }

    public void menu() {

        while (true) {

            System.out.println("=======================");
            System.out.println(" Bem-vindo ao sistema de alunos ");
            System.out.println("=======================");
            System.out.println(" 1. Cadastrar Alunos e notas");
            System.out.println(" 2. Verificar notas de alunos");
            System.out.println(" 0. Sair");
            System.out.println("=======================");
            System.out.print(" Digite uma opção: ");
            System.out.println();

            int opcao;

            try {
                opcao = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Opção inválida! Digite apenas números.");
                System.out.println();
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarAlunosENotas();
                    break;

                case 2:
                    verificarAlunosENotas();
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

    private void cadastrarAlunosENotas(){
        while (true){
            System.out.println("digite o nome do aluno e sua nota: exp:. 'Ana-9.9'; Digite 'sair' para sair");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String[] inputs = input.split("-");
                if(inputs.length != 2 ){
                    throw new IllegalArgumentException("Formato errado! use o formato 'Nome-Nota'");
                }

                String nome = inputs[0];
                double nota = Double.parseDouble(inputs[1].trim());

                notas.put(nome, nota);
            } catch (NumberFormatException e) {
                System.out.println("Erro: a nota precisa ser numérica (ex: 8.5)");
            } catch (IllegalArgumentException e) {
                 System.out.println(e.getMessage());
            }
        }
    }

    private void verificarAlunosENotas(){
        while (true){
            System.out.println();
            System.out.println(" ===== Verificação de Alunos ===== ");
            System.out.println();

            if (notas.isEmpty()) {
                System.out.println(" Não existem notas cadastradas.");
                System.out.println();
                return;
            }

            System.out.print(" Digite o nome do aluno: (ou 0 para voltar): ");
            String aluno = scan.nextLine();

            if(aluno.equals("0")){
                System.out.println(" Voltando ao menu...");
                System.out.println();
                break;
            }

            if (notas.containsKey(aluno)) {
                System.out.println(" A nota de " + aluno + " é "+ notas.get(aluno));
            } else {
                System.out.println(" O nome " + aluno + "' não está na lista!");
            }

            System.out.println();
        }
    }

}
