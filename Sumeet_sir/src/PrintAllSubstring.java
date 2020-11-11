
import java.util.Scanner;


public class PrintAllSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        
        for (int i = 0; i < name.length(); i++) {
            for (int j = i+1; j <= name.length(); j++) {
                System.out.println(name.substring(i, j));
            }
        }
    }
}
