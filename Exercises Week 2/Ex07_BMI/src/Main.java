import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int Weight;
        double Length;
        double BMI;

        System.out.println("Dear patient, this programma will calculate your BMI. ");
        System.out.println("Enter your weight in kilograms: ");
        Weight = keyboard.nextInt();
        System.out.println("Enter your length in meters: ");
        Length = keyboard.nextDouble();

        BMI = Weight/(Length * Length);

        System.out.println("Your BMI IS: " + BMI);
        /*
        if (condition) {
            if condition is true
        } else {
            if condition is false
        }

        condition
        a == b --> equal
        a < b -- > a smaller than b
        a <= b --> a smaller or equal than b
        a > b --> b larger than b
        a >= b --> b larger or equal than b
        * */
    }
}