package Practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();

        for(int i = 1; i<11 ; i++){
            int mul = n*i;
            System.out.println(n + " * " + i + " = "+ mul);
        }
    }
}
