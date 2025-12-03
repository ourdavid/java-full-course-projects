import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String productName;
        double priceEach;
        int qnt;
        char currency = '$';

        System.out.print("What item would you like to buy? ");
        productName = input.nextLine();


        System.out.print("What is the price for each? ");
        priceEach = input.nextDouble();

        System.out.print("How many would you like?: ");
        qnt = input.nextInt();


        System.out.println("You have bought "+ qnt + " "+ productName + "/s");
        System.out.println("Your total is " + currency + String.format("%.2f",qnt * priceEach));

        input.close();

    }
}
