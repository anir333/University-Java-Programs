import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Variable creation
        int number1;
        int number2;
        int number3;
        int operation_result;
        System.out.println("Enter a number: ");
        number1 = keyboard.nextInt();
        System.out.println("Enter another number: ");
        number2 = keyboard.nextInt();
        System.out.println("Enter a last number: ");
        number3 = keyboard.nextInt();
        operation_result = number1 * number2 * number3;
        System.out.print("The product is: " + operation_result);
    }
}