package kdg.be;
import java.util.Scanner;

public class ex03_08_Divisible {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("We'll print all numbers below 1000 that are divisible between 2 numbers of your choosing.");
        while (true) {
            System.out.println();
            System.out.print("Enter the first number (end program with 0): ");
            int first = keyboard.nextInt();
            if (first == 0) {
                break;
            } else {
                System.out.print("Enter the second number: ");
                int second = keyboard.nextInt();
                if ((first < 0) || (second<0)) {
                    System.out.println("Please enter a positive number.");
                } else {
                    int counter = -1;
                    for (int i = 0; i <= 1000; i++) {
                        if ((i % first == 0) && (i % second == 0)) {
                            counter += 1;
                            if (counter < 10) {
                                System.out.print(i + " ");
                            } else {
                                counter = 0;
                                System.out.println();
                                System.out.print(i + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
