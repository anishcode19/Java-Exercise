
import java.util.Scanner;


public class RotateAnArray {
    
    public static void reverse(int[] arr,int i,int j) {
        int start=i;
        int end=j;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            
            start++;
            end--;
        }
    }
    
    public static void rotate(int[] arr,int k) {
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        
//        for first part
        reverse(arr, 0, arr.length-1-k);
        
//        for second part
        reverse(arr, arr.length-k, arr.length-1);
        
//        for complete rotation
        reverse(arr, 0, arr.length-1);
    }
    
    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        
        int k=scn.nextInt();
        
        
        rotate(arr, k);
        display(arr);
    }
    
}
