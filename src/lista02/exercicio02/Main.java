package lista02.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = setString(scan);
        String[] halfs = separateString(word);
        printFirstHalf(halfs);
    }

    public static String setString(Scanner scan){
        return scan.nextLine();
    }

    public static String[] separateString(String string) {
        int half = string.length() / 2;
        char[] chars = string.toCharArray();

        char[] firstHalf = new char[half];
        char[] secondHalf = new char[string.length() - half];

        for(int i = 0; i < half; i++) {
            firstHalf[i] = chars[i];
        }

        for(int i = half; i < chars.length; i++) {
            secondHalf[i - half] = chars[i];
        }

        return new String[]{new String(firstHalf), new String(secondHalf)};
    }

    public static void printFirstHalf(String[] halfs){
        System.out.println("primeira parte "+halfs[0]);
    }
}
