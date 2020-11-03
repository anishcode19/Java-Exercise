
import java.util.Scanner;


public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        int[][] arr = new int[r][c];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        int minr=0;
        int maxr=arr.length-1;
        int minc = 0;
        int maxc=arr[0].length-1;
        
        int tElement = r *c;
        int count =0;
        while(count<tElement){
//            for left col

            for (int i = minr,j=minc; i <= maxr && count<tElement; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            
//            for bottom row
            for (int i = maxr,j=minc; j <= maxc && count < tElement; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            
//            for right col
            for (int i = maxr,j=maxc; i >=minr && count< tElement; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            
//            for top row
            for (int i = minr,j=maxc; j >=minc && count < tElement; j--) {
                System.out.println(arr[i][j]);
                count++;
            }minr++;
        }
    }
    
}
