package Strings;

import java.util.*;

public class ReverseUsingStringBuilder {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        if(input.isEmpty()){
            System.out.println("Invalid Input");
        } 
        else {
            StringBuilder reversed = new StringBuilder();

            for(int i = input.length() - 1; i >= 0; i--){
                
        
            reversed.append(input.charAt(i));
            }
            String finalResult = reversed.toString();

            System.out.println("Reversed String : " + finalResult);
        }
        sc.close();
    }
}

/*Time  → O(n)
Space → O(n) */
