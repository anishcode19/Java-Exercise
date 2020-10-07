
import java.util.Scanner;


public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int val=getValue(b,n1,n2);
        System.out.println(val);
    }
    
    public static int getValue(int b, int n1, int n2){
        int rv=0;
        int p=1;
        int c=0;
        while(n1> 0 || n2> 0 || c> 0){
            int r1=n1%10;
            int r2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int rval=r1+r2+c;
            int v=rval%b;
            c=rval/b;
            rv=rv+v*p;
            p*=10;
        }        
        return rv;
    }
}
