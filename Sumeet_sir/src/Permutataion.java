
import java.util.Scanner;


public class Permutataion {
    
    public static void Display(int n, int r,int npr){
        System.out.println(n+"p"+r+"="+ npr);
    }
    public static int fact(int x){
        
        int rv=1;
        for (int i = 1; i <=x; i++) {
            rv=rv*i;
        }
        
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int r=scn.nextInt();
        int nfact=fact(n);
        int rfact=fact(n-r);
        int npr=nfact/rfact;
        Display(n, r, nfact);
        Display(n, r, rfact);
        Display(n, r, npr);
    }
}
