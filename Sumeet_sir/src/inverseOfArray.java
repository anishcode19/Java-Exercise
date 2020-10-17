
import java.util.Scanner;

public class inverseOfArray {
    
    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i+ "\t");
        }
    }
    
    public static void inverse(int arr[]) {
        int inv[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            inv[val]=i;
        }
        display(inv);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        inverse(arr);
        
    }
    
}
