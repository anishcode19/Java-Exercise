
import java.util.Scanner;


public class searchInSorted2DArray {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        
        int i =0 ;
        int j =arr[0].length-1;
        while(i < arr.length && j >= 0){
            if(s == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(s < arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
        
        System.out.println("NOT FOUND!");
        
    }
    
}
