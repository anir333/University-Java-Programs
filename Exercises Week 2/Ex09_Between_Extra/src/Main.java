import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int middleNumber;

        System.out.print("Enter the first number: ");
        number1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        number2 = keyboard.nextInt();
        System.out.print("Enter the third number: ");
        number3 = keyboard.nextInt();

        /* Teachers code */
        middleNumber = number1;
        if (((number2 > number1) && (number2 < number3)) || ((number2 < number1) && (number2 > number3))) {
            middleNumber = number2;
        } else if (((number3 > number1) && (number3 < number2)) || ((number3 < number1) && (number3 > number2))) {
            middleNumber = number3;
        }

        /* My code
        if (number1 > number2 && number1 < number3) {
            middleNumber = number1;
        } else if (number1 < number2 && number1 > number3) {
            middleNumber = number1;
        } else if (number2 > number1 && number2 < number3) {
            middleNumber = number2;
        } else if (number2 < number1 && number2 > number3) {
            middleNumber = number2;
        } else if (number3 > number1 && number3 < number2) {
            middleNumber = number3;
        } else if (number3 < number1 && number3 > number2) {
            middleNumber = number3;
        } else {
            middleNumber = 0;
        }*/

        System.out.println("The middle number is: " + middleNumber);
    }
}