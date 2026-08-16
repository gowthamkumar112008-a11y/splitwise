package splitwise.micro_lab;

public class R_1 {
    public static void main(String[] args) {
//        LAB A
        int a = 10;
        long b = 100000L;
        double c = 10.5;
        boolean d = true;
        char e = 'A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

//        LAB B
        final double TAX_RATE = 0.18;
        double amount = 1000.0;

        double tax = amount * TAX_RATE;

        System.out.println("Tax = " + tax);

        // TAX_RATE = 0.20;   // Compile error

//        LAB C
        double value = 9.7;

        System.out.println((int) value);
        System.out.println((int) Math.round(value));

//LAB D
        int result1 = 5 / 2;
        double result2 = (double) 5 / 2;

        System.out.println(result1);
        System.out.println(result2);

    }
}
