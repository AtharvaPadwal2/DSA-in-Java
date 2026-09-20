package Strings;

import java.util.*;

public class StringBuilderBasics {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        
       
        StringBuilder sb = new StringBuilder(sc.nextLine());

        if (sb.isEmpty()) {
          System.out.println("Invalid Input");
        } else {
        
        sb.append(" ");
        sb.setCharAt(1, 'a');

        System.out.println(sb);

        System.out.println(sb.insert(1, 'a'));

        System.out.println(sb.deleteCharAt(1));

        System.out.println(sb.reverse());
 
        }
        sc.close();
    }
}
