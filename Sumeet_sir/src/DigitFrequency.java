
import java.util.Scanner;


public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int d= scn.nextInt();
        int count=0;
        while(n>0){
            int r = n%10;
            n=n/10;
            if(r==d){
                count++;
            }
        }
        System.out.println(count);
    }
}
