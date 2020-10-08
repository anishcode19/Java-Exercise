
import java.util.Scanner;


public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int val= getValue(b,n1,n2);
        System.out.println(val);
    }
    public static int getValue(int b, int n1, int n2){
        int rv=0;
        int c=0;
        int p=1;
        while(n2>0){
            int r1=n1%10;
            int r2=n2%10;
            n1=n1/10;
            n2=n2/10;
            r2=r2+c;
            int d=0;
            if(r2>=r1){
                c=0;
                d=r2-r1;
            }else{
                c = -1;
                d=r2+b-r1;
            }
            rv=rv + d*p;
            p=p*10;
        }
        
        return rv;
    } 
    
}
