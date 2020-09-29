
import java.util.Scanner;


public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
//        int sp=0;
//        int st=1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < sp; j++) {
//                System.out.print("\t");
//            }
//            for (int j = 0; j < st; j++) {
//                System.out.print("*");
//            }
//            sp++;
//            System.out.println();
//        }

//        other way

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
                System.out.println();
        }
    }
}
