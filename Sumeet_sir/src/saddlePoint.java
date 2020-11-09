
import java.util.Scanner;

public class saddlePoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n =  scn.nextInt();
        int[][] arr =  new int[n][n];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int idx = 0;
            for (int j = 1; j < arr.length; j++) {
                if(arr[i][j]<arr[i][idx]){
                    idx =j;
                }
            }
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][idx] > arr[i][idx]){
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                System.out.println(arr[i][idx]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
