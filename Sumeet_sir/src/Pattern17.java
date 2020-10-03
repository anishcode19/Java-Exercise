
import java.util.Scanner;


public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n/2;
        int st=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                if(i==n/2){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            if(i<n/2){
                st++;
            }else{
                st--;
            }
            System.out.println();
        }
        
    }
}
