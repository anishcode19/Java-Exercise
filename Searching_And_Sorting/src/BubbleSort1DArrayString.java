
public class BubbleSort1DArrayString {
    public static void main(String[] args) {
        String[] arr = {"Anish","Kartik","Ankush","Gorakh","Apurv","Samarth"};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j].compareTo(arr[j+1]) >0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                    
                }
            }
            if(flag == false){
                break;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"     ");
        }
    }
}
