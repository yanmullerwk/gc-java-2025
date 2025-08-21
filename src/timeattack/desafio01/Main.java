package timeattack.desafio01;

public class Main {
    public static void main(String[] args) {
        String primeiraLinha = retornaPrimeiraLinha();
        String segundaLinha = retornaSegundaLinha();
        String terceiraLinha = retornaTerceiraLinha();

        imprimeResultadoFinal(primeiraLinha, segundaLinha, terceiraLinha);
    }

    public static String retornaPrimeiraLinha(){
        return "=====";
    }
    public static String retornaSegundaLinha(){
        return "Eu sou Geração Caldeira 2025!";
    }
    public static String retornaTerceiraLinha(){
        return "-----";
    }
    public static void imprimeResultadoFinal(String primeiraLinha, String segundaLinha, String terceiraLinha){
        System.out.println(primeiraLinha);
        System.out.println(segundaLinha);
        System.out.println(terceiraLinha);
    }
}
