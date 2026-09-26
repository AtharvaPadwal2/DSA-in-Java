package Strings;
import java.util.*;
public class IsSubsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        System.out.print("Enter a substring to be found : ");
        String subString = sc.nextLine();

        if( input.isEmpty() || subString.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            input = input.toLowerCase();
subString = subString.toLowerCase();

            int first = 0;
            int second = 0;
               
            while (first < input.length() && second < subString.length()){
                if (input.charAt(first) == subString.charAt(second)) {
                    second ++ ;

            }
            first ++;
        }
        if( second == subString.length()){
            System.out.println("SubString exists");
        }
        else{
            System.out.println("SubString doesn't exist");
        }


        }
        sc.close();
    }
    
    
}

/*Time  → O(n)
Space → O(1) */