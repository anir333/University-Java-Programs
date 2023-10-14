import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce ASCII value: ");
        number = keyboard.nextInt();
        String ASCIItable = switch (number) {
            case 32 -> " :space bar";
            case 33 -> "!";
            case 34 -> "\"";
            case 35 -> "#";
            case 36 -> "$";
            case 37 -> "%";
            case 38 -> "&";
            case 39 -> "'";
            case 40 -> "(";
            case 41 -> ")";
            case 42 -> "*";
            default -> {
                yield "Program aborted";
            }
        };
        System.out.println(ASCIItable);
    }
}