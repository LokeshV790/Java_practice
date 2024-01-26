/* Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */

package Practice;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" First Number : ");
        int a = sc.nextInt();
        System.out.print(" Second Number : ");
        int b = sc.nextInt();

        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.println();


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int sum = a + b;
                System.out.println(sum);
            break;
            
            case 2:
                int sub = a - b;
                System.out.println(sub);
            break;

            case 3:
                int mul = a * b;
                System.out.println(mul);
            break;

            case 4:
                int div = a / b;
                System.out.println(div);
            break;

            case 5:
                float rem = a%b;
                System.out.println(rem);
            break;
            default: System.out.println("Invalid choice");
        }
        
    }

}
