
import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
//        no. of element in array
        int[] arr = new int[n];
//        loop for array input
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
//        search value
        int sval = scn.nextInt();
        
        int l = 0;   //lowest index
        int h = n-1; //highest index
        while(l<=h){
            int m = (l+h)/2; //mid val
            if(sval > arr[m]){
                l= m+1;
            }else if (sval < arr[m]) {
                h =m-1;
            }else{
                System.out.println(arr[m]);
                return;      // if found reeturn break the loop
            }
        }
        System.out.println(-1); //if not found return -1
    }
    
}
