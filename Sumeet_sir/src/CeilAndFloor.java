
import java.util.Scanner;


public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scn.nextInt();
        }
        int sval =scn.nextInt();
        
        int l=0;
        int h=n-1;
        int ceil =0;
        int floor =0;
        while (l <=h){
            int m = (l+h)/2;
            if(sval < arr[m])
            {
                h=m-1;
                ceil =arr[m];
            }
            else if(sval > arr[m]){
                l = m+1;
                floor =arr[m];
            }else{
                ceil=arr[m];
                floor =arr[m];
                break;
            }
        }
        
        System.out.println("ceil: "+ ceil);
        System.out.println("floor: "+ floor);
    }
    
}
