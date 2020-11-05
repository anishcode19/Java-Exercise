
import java.util.Scanner;


public class Reverse2DArray {
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= scn.nextInt();
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] =temp;
                
                li++;
                ri--;
            }
        }
        
        display(arr);
    }
    
}
