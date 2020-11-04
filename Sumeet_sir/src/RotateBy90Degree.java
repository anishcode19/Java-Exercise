
import java.util.Scanner;


public class RotateBy90Degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r= scn.nextInt();
        int c= scn.nextInt();
        int arr[][]= new int[r][c];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
//        main code

        for (int j = 0; j < arr.length; j++) {
            for (int i = arr[0].length-1; i >= 0; i--) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
}
