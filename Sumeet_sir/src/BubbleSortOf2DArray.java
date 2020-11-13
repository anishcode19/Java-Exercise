
import java.util.Scanner;


public class BubbleSortOf2DArray {
    
    public static void sorting(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length-1-j; k++) {
                    if(arr[i][j] > arr[i][j+1]){
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j+1];
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
    }
    
}
