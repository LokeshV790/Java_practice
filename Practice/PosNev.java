package Practice;

import java.util.Scanner;

public class PosNev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String ans = a>0? "positive": "negative";

        System.out.println(ans);
    }
    
}
