package Practice;

import java.util.Scanner;

public class RevOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to be reversed : ");
        int n = sc.nextInt();

        int rev = 0;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);

    }
}
