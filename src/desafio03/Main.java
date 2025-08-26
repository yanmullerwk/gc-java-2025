package desafio03;

import java.util.Scanner;

public class Main {
    static final float BONUS_COLLABORATOR_LEVEL_SILVER = 0.1f;
    static final float BONUS_COLLABORATOR_LEVEL_PLATINUM= 0.25f;
    static final float BONUS_COLLABORATOR_LEVEL_DIAMONT = 0.3f;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salary = readSalary(scan);
        scan.nextLine();
        String level =readCollaboratorLevel(scan);
        float adjustmentSalary = calculateSalaryAdjustment(salary, level);
        printSalaryAdjustment(salary, level, adjustmentSalary);
    }

    public static float readSalary(Scanner scan){
        System.out.println("Type the salary: ");
        return scan.nextFloat();
    }

    public static String readCollaboratorLevel(Scanner scan){
        System.out.println("Type the collaborator level: ");
        return scan.nextLine();
    }

    public static float calculateSalaryAdjustment(float salary, String collaboratorLevel){
        switch(collaboratorLevel.toLowerCase()){
            case "silver":
                return salary + (salary*BONUS_COLLABORATOR_LEVEL_SILVER);
            case "platinum":
                return salary + (salary*BONUS_COLLABORATOR_LEVEL_PLATINUM);
            case "diamond":
                return salary + (salary*BONUS_COLLABORATOR_LEVEL_DIAMONT);
            default:
                return -1;
        }
    }

    public static void printSalaryAdjustment(float salary, String collaboratorLevel, float salaryAdjustment){
        if(salaryAdjustment == -1){
            System.out.println("collaborator level not identified");
        }else{
            System.out.println("The salary of the collaborator level " + collaboratorLevel + " was adjusted From R$" + salary + " To R$" + salaryAdjustment);
        }
    }
}
