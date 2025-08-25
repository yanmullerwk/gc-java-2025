package lista01.exercicio07;

import java.util.Scanner;

public class Main {
    static final int CURRENT_YEAR = 2025;
    static final int MINIMUM_VOTING_AGE = 16;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear = readYear(scan);
        boolean elegibleVote = isElegibleToVote(birthYear);
        printVoteElegibilityMessage(elegibleVote);
    }

    public static int readYear(Scanner scan){
        return scan.nextInt();
    }

    public static boolean isElegibleToVote(int birthYear){
        int age = CURRENT_YEAR - birthYear;
        return age >= MINIMUM_VOTING_AGE;
    }

    public static void printVoteElegibilityMessage(boolean canVote){
        if(canVote){
            System.out.println("You can vote!");
        }else {
            System.out.println("You can't vote!");
        }
    }



}

