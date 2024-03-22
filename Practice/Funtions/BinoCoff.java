package Practice.Funtions;

import java.math.BigInteger;
import java.util.Scanner;

public class BinoCoff {
    public static BigInteger factorial(int n) {
        BigInteger f = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

    public static BigInteger BiCoff(int n, int r) {
        BigInteger nFact = factorial(n);
        BigInteger rFact = factorial(r);
        BigInteger NminusRFactorial = factorial(n - r);

        BigInteger biCoff = nFact.divide(rFact.multiply(NminusRFactorial));

        return biCoff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (n) : ");
        int n = sc.nextInt();

        System.out.print("Enter the number (r) : ");
        int r = sc.nextInt();

        BigInteger bicof = BiCoff(n, r);
        System.out.println(bicof);
    }
}
