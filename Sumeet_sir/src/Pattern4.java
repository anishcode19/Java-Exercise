
import java.util.Scanner;


public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int j = 0;
            for (; j < i; j++) {
                System.out.print("\t");
            }
            for (int k = j; k < n; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    
}
