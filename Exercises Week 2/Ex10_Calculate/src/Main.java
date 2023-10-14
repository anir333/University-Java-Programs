import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        int option;
        int operation;
        /*
        long
        byte
        short
        int

        float
        double

        boolean
        char - String
        * */

        System.out.print("Enter a number: ");
        number1 = keyboard.nextInt();
        System.out.print("Enter a second number: ");
        number2 = keyboard.nextInt();
        System.out.println("Choose an operation: ");
        System.out.println("1 --> Add");
        System.out.println("2 --> Substract");
        System.out.println("3 --> Multiply");
        System.out.println("4 --> Divide");
        System.out.println("Which operation do you choose (1, 2, 3, 4)? ");
        option = keyboard.nextInt();

        if (option == 1) {
            operation = number1 + number2;
            System.out.println("Your choice: 1 --> Add");
            System.out.println(number1 + " + " + number2 + " = " + operation);
        } else if (option == 2) {
            operation = number1 - number2;
            System.out.println("Your choice: 2 --> Substraction");
            System.out.println(number1 + " - " + number2 + " = " + operation);
        } else if (option == 3) {
            operation = number1 * number2;
            System.out.println("Your choice: 3 --> Multiply");
            System.out.println(number1 + " * " + number2 + " = " + operation);
        } else if (option == 4) {
            operation = number1 / number2;
            System.out.println("Your choice: 4 --> Divide");
            System.out.println(number1 + " / " + number2 + " = " + operation);
        } else {
            System.out.println("Inexistent option.");
        }
    }
}