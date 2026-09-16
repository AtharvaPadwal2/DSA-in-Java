package Strings;

import java.util.*;

public class StringBasics {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        

        if(name.isEmpty()){
            System.out.println("Invalid Input given");
        }
        else{

        System.out.println("The length of the string is : " + name.length());
        name = name.toLowerCase();
        System.out.println("lowercase: " + name);
        name = name.toUpperCase();
        System.out.println("UPPERCASE : " + name);
        System.out.println("First Character : " + name.charAt(0));
        System.out.println("Last Character : " + name.charAt(name.length() - 1));


        }
         sc.close();
    }
   
}
