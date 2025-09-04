package lista02.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favoritFood = setFavoritFood(scan);
        printReverseWord(favoritFood);
    }

    public static String setFavoritFood(Scanner scan){
        System.out.println("Digite sua comida favorita: ");
        return scan.nextLine();
    }

    public static void printReverseWord(String word){
        for(int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
