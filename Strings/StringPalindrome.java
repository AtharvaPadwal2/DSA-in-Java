package Strings;

import java.util.*;

public class StringPalindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        

        if(name.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            String reversed = "";
            for(int index = name.length() - 1; index >= 0; index--) {
                reversed += name.charAt(index);
                
            }
            
                if(name.equalsIgnoreCase(reversed)){
                    System.out.println("The given string is a palindrome ");

                }
                else{
                    System.out.println(" The string is not a palindrome");
                }
            
        }
        sc.close();
    }
}
