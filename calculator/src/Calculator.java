import java.util.Scanner;

public class Calculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1;
        char operator;
        double number2;
        double result = 0;
        boolean operatorInvalid = false;




        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();
        System.out.print("Enter an operator ( + , - , * , / ): ");
        operator = scanner.next().charAt(0);
        System.out.println("Enter the second number: ");
        number2 = scanner.nextDouble();


        switch (operator){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0){
                    System.out.println("Cannot division by zero!");
                    return;
                }else{
                    result = number1 / number2;
                }
                break;
            default:
                System.out.println("Operator invalid");
                operatorInvalid = true;
                break;
        }


        if (!operatorInvalid){
            System.out.println("Result: " + result);
        }

        scanner.close();


    }
}
