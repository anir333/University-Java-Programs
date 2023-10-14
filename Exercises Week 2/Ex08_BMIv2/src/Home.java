import java.util.Scanner;
public class Home {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double BMI;

        System.out.print("What is your BMI: ");
        BMI = keyboard.nextDouble();

        /* Teachers code */
        if (BMI < 18) {
            System.out.print("You're underweight.");
        } else if (BMI < 25) {
            System.out.print("You're in a healthy weight.");
        } else if (BMI < 30) {
            System.out.print("You're overweight.");
        } else {
            System.out.print("You're obese.");
        }

        /* My code
        if (BMI < 18) {
            System.out.print("You're underweight.");
        } else if (BMI >= 18 && BMI < 25) {
            System.out.print("You're in a healthy weight.");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.print("You're overweight.");
        } else if (BMI >= 30) {
            System.out.print("You're obese.");
        }
        */
    }
}