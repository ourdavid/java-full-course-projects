import java.util.Scanner;

public class minAndMax {
    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Array Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        intArray(array);


        int min = min(array);
        int max = max(array);
        System.out.println("min: " + min);
        System.out.println("max: " + max);

    }public static void intArray(int[] array){
        for(int i = 0; i < array.length ; i++){
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public static int min(int[] numbers){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
