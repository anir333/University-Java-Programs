package kdg.be;
import java.util.Scanner;

public class ex03_04_Multiples {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = keyboard.nextInt();
        final int MAX = 100;
        for (int i = num; i <= MAX; i++) {
            if (i % num == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
