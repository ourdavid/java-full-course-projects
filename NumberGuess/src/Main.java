import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random radom = new Random();

        int min = 1;
        int max = 100;
        int guess;
        int attemps = 0;
        int numberRandom = radom.nextInt(min,max+1);


        System.out.println("Number Guess Game");
        System.out.println("Guess a number between "+ min + "-"+ max);



        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();

            if (guess > numberRandom){
                System.out.println("To High");
            }else if (guess < numberRandom ){
                System.out.println("To low");
            }else{
                System.out.println("YOU WON");
            }
            attemps++;
        }while (guess != numberRandom);

        scanner.close();
    }
}
