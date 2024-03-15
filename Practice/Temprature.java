package Practice;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current temp : ");
        double temp = sc.nextDouble();

        String fev = temp>100?"You Have fever..!!":"No need to worry";
        System.out.println(fev);
    }
}
