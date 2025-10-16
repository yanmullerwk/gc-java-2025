package lista06.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init() { // <-- static adicionado
        Scanner sc = new Scanner(System.in);
        String entrada = entrada(sc);
        printaTipoDeAcao(entrada);
    }

    public static String entrada(Scanner scan) { // <-- static adicionado
        System.out.println("Digite um nível de acesso:");
        return scan.nextLine();
    }

    public static void printaTipoDeAcao(String tipoAcesso) {
        String descricao = "";
        switch (tipoAcesso.toLowerCase()) {
            case "admin":
                descricao = NivelAcesso.ADMIN.descricao;
                System.out.println(descricao);
                break;
            case "moderador":
                descricao = NivelAcesso.MODERADOR.descricao;
                System.out.println(descricao);
                break;
            case "usuario":
                descricao = NivelAcesso.USUARIO.descricao;
                System.out.println(descricao);
                break;
            default:
                System.out.println("Entrada inválida");
        }
    }
}
