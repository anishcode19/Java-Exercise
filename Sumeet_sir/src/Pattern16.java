
import java.util.Scanner;


public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int st=1;
        int sp=2*n-3;
        for (int i = 0; i < n; i++) {
            int val=1;
            for (int j = 0; j < st; j++) {
                System.out.print(val+"\t");
                val++;
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            if(i==n-1){
                st--;
                val--;
            }
            for (int j = 0; j < st; j++) {
                val--;
                System.out.print(val+"\t");
            }
            
            st++;
            sp-=2;
            System.out.println();
        }
    }
}
