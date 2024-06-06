package Day3;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String to check: ");
        String str=sc.nextLine();
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome string");
        }
    }
}
