
import java.util.Scanner;


public class InterchangeDiagonalElement {
    
    public static void Display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
//        solution
        
        for (int i = 0; i < n; i++) {
            int temp  = arr[i][i];
            arr[i][i] = arr[i][n-1-i];
            arr[i][n-1-i] = temp;
        }
        Display(arr);
    }
}
