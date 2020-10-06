

import java.util.Scanner;


public class AnyBaseToAnyBase {
    public static int getValueInBase(int n,int b1,int b2) {
        int rv=0;
//        first way

//        int i=0;
//        while(n>0){
//            int r=n%b2;
//            rv=rv+r*(int)Math.pow(b1, i);
//            n=n/b2;
//            i++;
//        }

//      second way

        int p=1;
        while(n>0){
            int r=n%b2;
            n=n/b2;
            rv+= r*p;
            p*=b1;
        }

        return rv;
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        int val = getValueInBase(n, b1, b2);
        System.out.println(val);
    }
}
