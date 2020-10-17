
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InverseOfArray2 {
    
    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + "\t");
        }
        System.out.print(sb);
    }
    
    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            inv[val]= i;
        }
        
        return inv;
    }
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        int n = Integer.parseInt(br.readLine());
        int arr[] =new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int inv[]=inverse(arr);
        display(inv);
    }
    
}
