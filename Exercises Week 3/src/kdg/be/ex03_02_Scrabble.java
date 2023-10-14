package kdg.be;
import java.util.Scanner;
public class ex03_02_Scrabble {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a letter from the english alphabet: ");
        String letter = keyboard.next();
        switch (letter.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "l":
            case "n":
            case "s":
            case "t":
            case "r": System.out.println(1 + " point");
                break;
            case "d":
            case "g": System.out.println(2 + " points");
                break;
            case "b":
            case "c":
            case "m":
            case "p": System.out.println(3 + " points");
                break;
            case "f":
            case "h":
            case "v":
            case "w":
            case "y": System.out.println(4 + " points");
                break;
            case "k": System.out.println(5 + " points");
                break;
            case "j":
            case "x": System.out.println(6 + " points");
                break;
            case "q":
            case "z": System.out.println(7 + " points");
                break;
            default: System.out.println("Wrong, not a letter in the english alphabet!");
                break;
        }

        // System.out.println(letter);
    }
}
