/*
 * Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
 */

package Practice;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        int choice;
        do{
            System.out.print("Enter the No. : ");
            int n = sc.nextInt();

            if(n % 2 == 0){
                evenSum += n;
            } else {
                oddSum += n;
            }

            System.out.print("Do you want to continue 1 to continue or 0 to exit: ");
            choice= sc.nextInt();
        } while(choice==1);

        System.out.println("even sum : "+ evenSum);
        System.out.println("Odd Sum is : "+ oddSum);
    }
}
