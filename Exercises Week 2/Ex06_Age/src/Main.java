import java.time.LocalDate;
import java.util.Scanner;
/*package src.kdg.exercice_6*/
public class Main {
    public static void main(String[] args) {
        String name;
        int yearBirth;
        int currentYear;
        int age;

        currentYear = LocalDate.now().getYear();

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Dear " + name + ", please enter the year you were born in: ");
        yearBirth = keyboard.nextInt();

        age = currentYear - yearBirth;

        System.out.print("If all goes well you'll be " + age + " by the end of the year");

    }
}