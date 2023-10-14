package kdg.be;

public class Ex02_02numbersv1 {
    public static void main(String[] args) {
        /*
        // Part 1, 2

        long num1 = 10000;
        long num2 = 10000;
        long result = num1 + num2;
        System.out.println(result);
        */

        // Part 3
        /* int first = 8;
        int second = 5;
        System.out.println("Their sum: " + (first + second));
        System.out.println("Difference: " + (first - second));
        System.out.println("Product: " + (first * second));
        System.out.println("Quotient: " + (first / second));
        System.out.println("Remainder: " + (first % second));
        */

        // Part 4
        int first = 8;
        int second = 5;
        int result = ++first;
        int result2 = first++;
        int result3 = --second;
        int result4 = second--;
        System.out.println("Their sum: " + (first + second));
        System.out.println("Difference: " + (first - second));
        System.out.println("Product: " + (first * second));
        System.out.println("Quotient: " + (first / second));
        System.out.println("Remainder: " + (first % second));
        System.out.println("Result: " + result);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }

}
