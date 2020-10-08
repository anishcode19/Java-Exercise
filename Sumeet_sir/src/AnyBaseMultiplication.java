
import java.util.Scanner;


public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int val=getValue(b,n1,n2);
        System.out.println(val);
    }
    public static int getValue(int b, int n1, int n2){
        int rv=0;
        int p=1;
        while(n2>0){
            int r2=n2%10;
            n2=n2/10;
            
            int val=getProductWithSingleDigit(b,n1,r2);
            rv=getValueAddition(b,rv, val*p);
        }
        
        return rv;
    }
    
    public static int getValueAddition(int b, int n1, int n2){
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
    public static int getProductWithSingleDigit(int b,int n1,int r2){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || c>0){
            int d1=n1%10;
            n1=n1/10;
            
            int d=d1*r2+c;
            
            c=d/b;
            d=d%b;
            
            rv=rv+d*p;
            p=p*10;
        }
        
        return rv;
}
}
