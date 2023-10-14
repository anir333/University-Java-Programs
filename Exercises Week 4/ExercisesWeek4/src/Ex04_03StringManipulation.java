import java.util.Scanner;

public class Ex04_03StringManipulation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String sentence;

        System.out.print("Enter a sentence: ");
        sentence = keyboard.nextLine();
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.replace('a', 'o'));
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
        int counter = 0;
        for (int i=0;i<sentence.length();i++) {
            if (sentence.charAt(i) == 'e') {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(sentence);
    }
}