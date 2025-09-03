package lista02.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //digitar 1 num
        //digitar outro num
        //fazer um array com todos numeros desse intervalo
        //verificar quais numeros desse intervalo é primo

        int firstNumber = setNumber(scan);
        int secondNumber = setNumber(scan);

        int smallerNumber = checkIfIsSmaller(firstNumber, secondNumber);
        int largerNumber = checkIfIsLargger(firstNumber, secondNumber);

        int[] range = createArray(smallerNumber, largerNumber);
        printPrimeNumbers(range);
    }

    public static int setNumber(Scanner scan){
        return scan.nextInt();
    }

    public static int checkIfIsLargger(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static int checkIfIsSmaller(int a, int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    public static int[] createArray(int smaller, int larger){
        int size = larger - smaller + 1;
        int[] array = new int[size];

        for(int i=0;i<size;i++){
            array[i]=smaller++;
        }

        return array;
    }

    public static void printPrimeNumbers(int[] array){
        for(int i=0; i<array.length; i++){
            int num = array[i];
            boolean isPrime = true;

            if(num < 2){
                isPrime = false;
            } else {
                for(int j=2; j<=Math.sqrt(num); j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                System.out.print(num + " ");
            }
        }
    }


}
