
import java.util.Scanner;


public class FirstIndexAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int sval = scn.nextInt();
        
//        first index;
        int l=0;
        int h=n-1;
        int fi=-1;
        int li = -1;
        while(l<=h){
            int m = (l+h)/2;
            if(sval<arr[m]){
                h=m-1;
            }else if (sval > arr[m]) {
                l=m+1;
            }else{
                fi=m;
                h=m-1;
            }
        }
        System.out.println(fi);
//        last index

        l=0;
        h=n-1;        
        while(l<=h){
            int m = (l+h)/2;
            if(sval<arr[m]){
                h=m-1;
            }else if (sval > arr[m]) {
                l=m+1;
            }else{
                li=m;
                l=m+1;
            }
        }
        System.out.println(li);
    }
    
}
