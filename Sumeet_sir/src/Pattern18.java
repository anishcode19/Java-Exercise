
import java.util.Scanner;


public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=0;
        int st=n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                if(i>0 && i<n/2 && j>0 && j<st-1){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");

                }
            }
            if(i<n/2){
                st-=2;
                sp++;
            }else{
                st+=2;
                sp--;
            }
            System.out.println();
        }
    }
}
