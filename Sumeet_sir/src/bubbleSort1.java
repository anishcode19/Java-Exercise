
import java.util.Scanner;

public class bubbleSort1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = {29,19,36,12,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
//        print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "  ");
        }
    }
}
