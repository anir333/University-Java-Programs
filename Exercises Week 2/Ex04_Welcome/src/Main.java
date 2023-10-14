import java.util.Scanner; // To communicate with the keyboard

public class Main {
    public static void main(String[] args) {
        String firstName; // Declare variable
        Scanner keyboard = new Scanner(System.in); //Communicate with keyboard
        System.out.print("What's your name? "); // Print out a input element
        firstName = keyboard.nextLine(); // Store the input in the variable
        System.out.print("Welcome " + firstName + "!"); // Print out the output
    }
}