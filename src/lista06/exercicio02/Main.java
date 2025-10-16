package lista06.exercicio02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        HashSet<Integer> unicos = new HashSet<>();

        System.out.println("Digite números inteiros (digite -1 para parar):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            numeros.add(num);
        }


        for (int n : numeros) {
            unicos.add(n);
        }

        System.out.println("Números únicos:");
        System.out.println(unicos);
    }

}
