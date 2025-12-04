import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char playAgain = 'y';
        String[] moves = {"rock","paper","scissors"};

        do {
            int playerIndex ;
            int computerIndex;

            System.out.printf("Enter your move (%s %s %s) : ",moves[0],moves[1],moves[2]);
            String choose = scanner.next();

            playerIndex = Arrays.asList(moves).indexOf(choose);
            computerIndex = random.nextInt(moves.length);

            if(!Arrays.asList(moves).contains(choose)){
                System.out.println("Invalid choose");
                continue;
            }

            System.out.println("Computer chose: " + moves[computerIndex]);

            if(playerIndex == computerIndex){
                System.out.println("Draw");
            }else if ((playerIndex + 1) % 3 == computerIndex){
                System.out.println("You Lose");
            }else{
                System.out.println("You Win");
            }

            System.out.print("Play again ? (y) / (n): ");
            playAgain = scanner.next().toLowerCase().charAt(0);

        }while (playAgain != 'n');

        System.out.println("Bye bye");
        scanner.close();

    }
}
