
public class SelectionSort2DArray {
    public static void main(String[] args) {
        int[][] arr = {{57,37,12,5},
                       {7,74,12,45},
                       {5,47,2,25},
                       {96,3,16,58},};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int min = j;
                for (int k = j+1; k < arr[i].length; k++) {
                    if(arr[i][min] > arr[i][k]){
                        min = k;
                    }
                }
                int temp = arr[i][j];
                arr[i][j] = arr[i][min];
                arr[i][min] = temp;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ "      ");
            }
            System.out.println();
        }
    }
    
}
