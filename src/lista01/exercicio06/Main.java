package lista01.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroUm = recebeNumero(scan, "digite o primeiro numero:");
        int numeroDois = recebeNumero(scan, "digite o segundo numero:");
        int numeroTres = recebeNumero(scan, "digite o tercer numero:");
        scan.nextLine();
        scan.close();

        printResults(numeroUm,numeroDois,numeroTres);
    }

    public static int recebeNumero(Scanner scan, String menssagem){
        System.out.println(menssagem);
        return scan.nextInt();
    }

    public static int retornaMenorNumero(int numeroX, int numeroY, int numeroZ){
        if(numeroX < numeroY && numeroX < numeroZ){
            return numeroX;
        }else if(numeroY < numeroZ && numeroY < numeroX){
            return numeroY;
        }else if(numeroZ < numeroX && numeroZ < numeroY){
            return numeroZ;
        }else {
            return -1;
        }
    }

    public static int retornaMaiorNumero(int numeroX, int numeroY, int numeroZ){
        if(numeroX > numeroY && numeroX > numeroZ){
            return numeroX;
        } else if(numeroY > numeroZ && numeroY > numeroX){
            return numeroY;
        }else if(numeroZ > numeroX && numeroZ > numeroY){
            return numeroZ;
        }else{
            return -1;
        }
    }

    public static int retornaMedia(int maior, int menor){
        return (menor + maior)/2;
    }

    public static void printResults(int numeroX, int numeroY, int numeoroZ){
        int maior = retornaMaiorNumero(numeroX, numeroY, numeoroZ);
        int menor = retornaMenorNumero(numeroX, numeroY, numeoroZ);
        int media = retornaMedia(maior, menor);
        System.out.println("maior numero: "+maior+ "\nmenor numero: "+menor+ "\nmedia: "+media);
    }
}
