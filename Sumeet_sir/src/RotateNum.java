
import java.util.Scanner;


public class RotateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("Enter number:");
        int k = sc.nextInt();
        int nod=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        k=k%nod;
        System.out.println(nod);
        if(k<0){
            k=k+nod;
        }
        int div;
        int mult;
        div=(int)Math.pow(10, k);
        mult=(int)Math.pow(10, (nod-k));
        int rem= n%div;
        int q= n/div;
        int r=rem*mult + q;
        System.out.println(r);
    }
}
