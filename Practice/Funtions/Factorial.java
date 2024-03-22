package Practice.Funtions;

import java.math.BigInteger; // int cant give for larger numbers, long cant give for larger no. so we used BigInteger
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(int n) {
        BigInteger f = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        BigInteger fact = factorial(n);
        System.out.println("Factorial of " + n + " = " + fact);
    }
}