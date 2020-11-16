
public class Bubblesort2DArray {
    public static void main(String[] args) {
        int[][] arr = {{57,37,12,5},
                       {7,74,12,45},
                       {5,47,2,25},
                       {96,3,16,58},};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                boolean flag = false;
                for (int k = 0; k < arr[0].length-1-j; k++) {
                    if(arr[i][k]>arr[i][k+1]){
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k+1];
                        arr[i][k+1] = temp;
                        flag = true;
                    }
                }
                if(flag == false){
                    break;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
