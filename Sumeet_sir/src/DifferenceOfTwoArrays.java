
import java.util.Scanner;


public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        for(int i=0; i<n1;i++){
            arr1[i]= scn.nextInt();
        }
        
        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int i=0; i<n2;i++){
            arr2[i]= scn.nextInt();
        }
        
        int arr3[]=new int[n2];
        int c=0;
        
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;
        
        while(k>=0){
            int d=0;            
            int aval=0;
            if(i>=0){
                aval=arr1[i];
            }
            else{
                aval=0;
            }            
            
            if(arr2[j] + c>=aval){
                d=arr2[j]+c-aval;
                c=0;
            }else{
                d=arr2[j]+c+10-aval;
                c=-1;
            }
            
            arr3[k]=d;
            i--;
            j--;
            k--;
        }
        
        int idx=0;
        while(idx<arr3.length){
            if(arr3[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx<arr3.length){
            System.out.println(arr3[idx]);
            idx++;
        }
    }
    
}
