import java.util.Random;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int result = 0;

        System.out.print("Enter the number of dice roll: ");
        numOfDice = scanner.nextInt();
        System.out.printf("You rolled %d dice... \n",numOfDice);

        if(numOfDice <= 0){
            System.out.println("Number must be greater than zero.");
            return;
        }

        for (int i = 0; i < numOfDice ; i++){
            int roll = random.nextInt(6)+1;
            System.out.print(printDiceFace(roll));;
            result += roll;
        }
        System.out.println("Total rolled: " + result);

        scanner.close();
    }public static String printDiceFace(int number){
        StringBuilder sb = new StringBuilder();
        sb.append(" ------- \n");

        switch (number){
            case 1:
                sb.append("|       |\n");
                sb.append("|   •   |\n");
                sb.append("|       |\n");
                break;
            case 2:
                sb.append("|      •|\n");
                sb.append("|       |\n");
                sb.append("|•      |\n");
                break;
            case 3:
                sb.append("|•      |\n");
                sb.append("|   •   |\n");
                sb.append("|      •|\n");
                break;
            case 4:
                sb.append("|•     •|\n");
                sb.append("|       |\n");
                sb.append("|•     •|\n");
                break;
            case 5:
                sb.append("|•     •|\n");
                sb.append("|   •   |\n");
                sb.append("|•     •|\n");
                break;
            case 6:
                sb.append("|•     •|\n");
                sb.append("|•     •|\n");
                sb.append("|•     •|\n");
               break;
            default:
                break;

        }
        sb.append(" ------- \n");
        sb.append("Rolled Value: ").append(number).append("\n");
        return sb.toString();
    }
}
