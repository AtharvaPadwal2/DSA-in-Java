package Strings;
import java.util.*;
public class FirstLastOccurrenceString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String input = sc.nextLine();

        if(input.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            input = input.toLowerCase();

            int[] frequency = new int[26];

            for(int i = 0; i< input.length(); i++){
                char ch = input.charAt(i);
                if(Character.isLetter(ch)){
                frequency [ch - 'a']++;
            }
        }

        boolean found = false;
             for(int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if(Character.isLetter(ch) && frequency[ch - 'a'] == 1) {
                    System.out.println("First Non-Repeating Character : " + ch);
                    found = true;
                    break;
                }
            }
            boolean lastfound = false;
             for(int i = input.length() - 1; i >= 0; i--) {
                char ch = input.charAt(i);
                if(Character.isLetter(ch) && frequency[ch - 'a'] == 1) {
                    System.out.println("Last Non-Repeating Character : " + ch);
                    found = true;
                    break;
                    
                }
            }
            if(!found || !lastfound){
                System.out.println("No repeating character found ");
            }



        }
        sc.close();
    }
    
}
