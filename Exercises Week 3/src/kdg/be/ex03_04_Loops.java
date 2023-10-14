package kdg.be;

public class ex03_04_Loops {
    public static void main(String[] args) {
        // Ex. 1:
        for (int i = 120; i >= 100; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Ex. 2:
        for (int i = 50; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Ex. 3:
        for (int i = 10_000; i >= 0; i--) {
            if ((Math.pow(5, i)) <= 10_000) {
                System.out.print( (int) Math.pow(5, i) + " ");
            }
        }
        System.out.println();

        // Ex. 4:
        char currentChar = 'a'; // Start with 'A'

        System.out.print("Alphabet: ");

        // Loop to display the alphabet from 'A' to 'Z'
        while (currentChar <= 'z') {
            System.out.print(currentChar + " ");
            currentChar++; // Increment to the next character
        }
    }
}
