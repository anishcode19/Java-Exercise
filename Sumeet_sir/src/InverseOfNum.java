
import java.util.Scanner;


public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int inv=0;
        while(n>0){
            int rem=n%10;
            p++;
            inv=inv+p*(int)Math.pow(10, rem-1);
            n=n/10;
        }
        System.out.println(inv);
    }
}
