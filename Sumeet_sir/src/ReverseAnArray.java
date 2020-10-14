
import java.util.Scanner;


public class ReverseAnArray {
    
    public static void display(int [] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static void reverse(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        reverse(arr);
        display(arr);
    }
}
