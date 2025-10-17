package lista06.desafio06;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();

        String[] palavras = frase.split(" ");
        HashMap<String, Integer> contaPalavras = new HashMap<String, Integer>();
        for(String palavra : palavras){
            if(contaPalavras.containsKey(palavra)){
                contaPalavras.put(palavra, contaPalavras.get(palavra) + 1);
            }else{
                contaPalavras.put(palavra, 1);
            }
        }

        System.out.println(contaPalavras);
    }
}
