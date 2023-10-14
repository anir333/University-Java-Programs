package kdg.be;
import java.util.Scanner;

public class Ex02_03Taxes {
    public static void main(String[] args) {
        float VAT;
        float amount;
        int choice;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the VAT percentage: ");
        VAT = keyboard.nextFloat();
        System.out.print("Enter an amount: ");
        amount = keyboard.nextFloat();
        System.out.print("Make a choice (1 = inclusive, 2 = exclusive): ");
        choice = keyboard.nextInt();

        if (choice == 1) {
            float amountWithoutVAT = amount / (1 + (VAT / 100));
            System.out.println("$" + amountWithoutVAT + " + " + VAT + "% VAT = " + "$" + amount);
        } else if (choice == 2) {
            float amountWithVAT = amount + (amount * (VAT / 100));
            System.out.println("$" + amount + " + " + VAT + "% VAT = " + "$" + amountWithVAT);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
