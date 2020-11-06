
import java.util.Scanner;

/*
1. You are given a number n, representing the number of rows of a matrix.
2. You are given a number m, representing the number of columns of a matrix.
3. You are given n * m numbers, representing elements of 2d array a.

shell-rotate

4. You are given a shell number s.
5. You are given a number r, representing number of anti-clockwise rotations (for +ve numbers) of the shell s.
6. You are required to rotate the sth shell of matrix by r rotations and display the matrix using display function.
 */
public class ShellRotate {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        rotateShell(arr, r, s);
        display(arr);
    }
    
    public static void rotateShell(int[][] arr,int r,int s) {
        int[] oned=findShell(arr, s);
        rotate(oned, r);
        fillshell(oned, arr, s);
    }
    
    public static int[] findShell(int[][] arr,int s) {
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        
        int sz = 2*(maxr-minr+1)+ 2*(maxc-minc+1)-4;
        int[] oned = new int[sz];
        int j=0;
//        left shell
        for (int i = minr; i <= maxr; i++) {
            oned[j]= arr[i][minc];
            j++;
        }
        
        for (int i = minc+1; i <= maxc; i++) {
            oned[j]= arr[maxr][i];
            j++;
        }
        
        for (int i = maxr-1; i >= minr; i--) {
            oned[j]= arr[i][maxc];
            j++;
        }
        
        for (int i = maxc-1; i > minc; i--) {
            oned[j] = arr[minr][i];
            j++;
        }
        return oned;
        
    }
    
    public static void rotate(int[] oned,int r) {
        r=r%oned.length;
        if(r<0){
            r=r+oned.length;
        }
//        for first part
        reverse(oned, 0, oned.length-r-1);
        
//        for second part
        reverse(oned,oned.length-r,oned.length-1);
        
//        for complete rotation
        reverse(oned,0,oned.length-1);


    }
    
    public static void reverse(int[] oned,int li,int ri) {
        while(li<ri){
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            
            li++;
            ri--;
        }
    }
    
    public static void fillshell(int[] oned,int [][] arr,int s) {
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        
        int j=0;
//        left shell
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = oned[j];
            j++;
        }
//        bottom shell
        for (int i = minc+1; i <= maxc; i++) {
            arr[maxr][i] = oned[j];
            j++;
        }
//        right shell
        for (int i = maxr-1; i >= minr; i--) {
            arr[i][maxc] = oned[j];
            j++;
        }
//        top shell
        for (int i = maxc-1; i > minc; i--) {
            arr[minr][i] = oned[j];
            j++;
        }
    }
    
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }
}