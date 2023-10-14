package kdg.be;

public class Ex02_01Variables {
    public static void main(String[] args) {
        boolean b = true;
        char c = '\u0001';
        byte bt = 127;
        short s = 32767;
        int i = 2_000_000_000;
        long l = 123456789123456789L;
        float f = 25.0f;
        double d = 0.1;
        
        System.out.println("boolean: " + b);
        System.out.println("char: " + c);
        System.out.println("byte: " + bt);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        final double PI = 3.14;
        System.out.println("final double: " + PI);
        // PI = 3.1415926536; --> can't modify a final variable!
    }
}
