import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int length = 3;
        double[] prices = new double[length];
        String[] items = new String[length];

        if(length>0){
            addItem(items,prices);
            display(items,prices);
            System.out.println();
            System.out.println(display(items,prices));
            System.out.println("Total: "+String.format("%.2f",totalSum(prices)));
            System.out.println("Average price: "+ String.format("%.2f",totalSum(prices)/length));
        }else {
            System.out.println("Length not be under zero.");
        }


    }static String display(String[] items, double[] prices){
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------\n");
        for (int i = 0; i < items.length; i++) {
            sb.append(String.format("Item: %s | Price: %.2f%n", items[i], prices[i]));
        }
        sb.append("-----------------\n");
        return sb.toString();
    }

     static void addItem(String[] item, double[] price){
        for (int i = 0; i < item.length; i++) {
            System.out.print("Item #"+(i+1)+" Name: ");
            item[i] = scanner.nextLine();

            addPrice(price,i);
        }
    }static void addPrice(double[] price, int number){
            System.out.print("price #"+(number+1)+" Value: ");
            price[number] = scanner.nextDouble();
            scanner.nextLine();

    }
    static double totalSum(double[] numbers){
        double total = 0;
        for (double number: numbers){
            total += number;
        }
        return total;
    }


}
