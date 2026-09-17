package Strings;

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        String result = "";

        if(name.isEmpty()){
            System.out.print("Invalid Input");
        }
        else{
            for(int index = 0 ; index<name.length(); index++){
                
                char ch = name.charAt(index);
 
                if(!Character.isWhitespace(ch)){
                    result += ch;
                    
                    
                }
                
            }
            System.out.println(result);
        }

        sc.close();
    }
    
}


/* both time and space complexity are O(n) */