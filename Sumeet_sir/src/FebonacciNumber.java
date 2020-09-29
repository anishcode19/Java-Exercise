
import java.util.Scanner;


public class FebonacciNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int j=0;
        int sum;
        int k=1;
        for (int i = 0; i < n; i++) {
            System.out.println(j);
            sum=k+j;
            j=k;
            k=sum;
        }
    }
    
}
