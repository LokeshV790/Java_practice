package Practice.Patterns;

public class RevStar {
    public static void main(String[] args) {
        int n = 90;
        for(int line = 1 ; line <= n ; line++){
            for(int i = 1; i <= (n-line+1); i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
