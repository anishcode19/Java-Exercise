
import java.util.Scanner;

public class DecimalToAnyBase {
    public  static int getValueInBase(int n , int y){
        int rv=0;
//      first way

//        int i=0;
//        while(n>0) {
//            int r =n%y;
//            rv=rv+r* (int)Math.pow(10, i);
//            n=n/y;
//            i++;
//        }

// second way

        int p=1;
        while(n>0){
            int r=n%y;
            n=n/y;
            rv+=r*p;
            p*=10;            
        }
        return rv;
}
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }
}
