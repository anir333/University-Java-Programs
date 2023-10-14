package kdg.be;

public class ex03_05_Factorial {
    public static void main(String[] args) {
        for (long i = 1; i <= 20; i++) {
            long r = i;
            long ans = r;
            for (r = i-1; r >= 1; r--) {
                ans *= r;
            }
            System.out.println(i + "! = " + ans);
        }
    }
}

