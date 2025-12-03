import java.text.NumberFormat;
import java.util.Scanner;

public class Baking {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int choose;
        boolean isRunning = true;
        double balance = 0.0;

        while (isRunning){


            System.out.println(display());
            System.out.print("Choose a option: ");
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    display(balance);
                    break;
                case 2:
                    balance = deposit(balance);
                    break;
                case 3:
                    balance = withdraw(balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Option Invalid");
                    break;
            }
        }
        scanner.close();



    } public static String display(){
        StringBuilder sb = new StringBuilder();

        sb.append("***************\n");
        sb.append("BANKING").append("  ").append("PROGRAM\n");
        sb.append("***************\n");
        sb.append("\n");
        sb.append("1. Show Balance\n");
        sb.append("2. Deposit\n");
        sb.append("3. Withdraw\n");
        sb.append("4. Exit\n");
        sb.append("\n");
        sb.append("***************\n");

        return sb.toString();
    }public static void display(double balance){
        System.out.println(NumberFormat.getCurrencyInstance().format(balance));;

    }public static double deposit(double balance){
        System.out.print("Enter a deposit: ");
        double amount;

        amount = scanner.nextDouble();
        if(amount <= 0){
            System.out.println("Deposit not accepted.");
        }else {
            balance += amount;
        }
        return balance;

    }public static double withdraw(double balance){
        double withdraw;
        System.out.print("Enter a Withdraw: ");
        withdraw = scanner.nextDouble();

        if(withdraw > balance || withdraw <= 0){
            System.out.println("Invalid Withdraw");
        }else{
            balance -= withdraw;
        }
        return balance;
    }



}
