

/*
Question
1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Input Format
A String

Output Format
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Constraints
 1 <= length of string <= 500

Sample Input
abcc

Sample Output
a
b
c
cc
c
*/
import java.util.Scanner;

public class PrintAllPalindromicSubstrings {
    public static boolean isplandrome(String ss){
        boolean flag = false;
        int f = 0;
        int l = ss.length()-1;
        while(f<=l){
            char ch1 = ss.charAt(f);
            char ch2 = ss.charAt(l);
            if(ch1 == ch2){
                flag = true;
                f++;
                l--;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String var = "abcc";
        for (int i = 0; i < var.length(); i++) {
            for (int j = i+1; j <= var.length(); j++) {
                String ss = var.substring(i,j);
                if(isplandrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }
}
