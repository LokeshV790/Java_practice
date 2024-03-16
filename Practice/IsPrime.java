package Practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n==2){
            System.out.println(n + " is a prime no.");
        } else {
            for(int i = 2; i <= Math.sqrt(n); i++){  // any no. has its maximum multiple is sqrt(Number itself) we used Math.sqrt(n) from Java.util.math
                if(n%i==0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n + " is Prime");
            } else {
                System.out.println(n + " is not a prime");
            }
        }
    }
    
}
