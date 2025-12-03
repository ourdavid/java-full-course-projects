import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double LBS_TO_KG = 0.45359237;
        final double KG_TO_LBS = 2.20462;

        int choise;
        double weight;
        double result;


        System.out.println("1: convert lbs to Kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.println("Choose an option: ");
        choise = input.nextInt();

        if(choise == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();

            result = weight *  LBS_TO_KG;
            System.out.println("The new weight in lbs: " + String.format("%.2f",result));

        } else if (choise == 2) {
                System.out.print("Enter the weight in kgs: ");
                weight = input.nextDouble();
                result =  weight * KG_TO_LBS;
                System.out.print("Enter the weight in lbs: " + String.format("%.2f",result));
        }else{
            System.out.println("chose a option Valid!!");
        }

        input.close();
    }
}
