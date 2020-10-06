
import java.util.Scanner;


public class AnyBaseToDecimal {
    
    public static  int getValueInBase(int n, int b){
        int rv=0;
//        first way
        
//        int i=0;
//        while(n>0){
//            int r=n%10;
//            rv=rv+r*(int)Math.pow(b, i);
//            n=n/10;
//            i++;
//        }

// second way
        int p=1;
        while(n>0){
            int r=n%10;
            n=n/10;
            rv+=r*p;
            p*=b;
        }
        
        return rv;
    }
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
}
