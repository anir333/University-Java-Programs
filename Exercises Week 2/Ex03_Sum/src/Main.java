
public class Main {

    public static void main(String[] args) {
        long result = 1;

        for (int number = 1; number <=20 ;number++) {
            result *= number;
            System.out.printf("%d! = %d \n", number, result);
        }
    }  // main()

}  // class
