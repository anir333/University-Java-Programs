package kdg.be;
import java.util.Scanner;

public class ex03_01_Age {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /*boolean stop = true;*/
        do {
            System.out.print("Enter your age or nª 404 to break: ");
            int age = keyboard.nextInt();

            if (age == 404) {
                System.out.println("Good job!");
                break;
            }
            else if (age < 2) {
                System.out.println("Baby");
            } else if (age <= 12) {
                System.out.println("Child");
            } else if (age <= 17) {
                System.out.println("Teenager");
            } else {
                System.out.println("Adult 18+");
            }
        } while (true);
    }
}