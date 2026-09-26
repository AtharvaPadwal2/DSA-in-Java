package Strings;
import java.util.*;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: " );
        String input = sc.nextLine();

        if(input.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            int count = 0;
            int maxLength = 0;
            String longestWord = "";
            int start = 0;
           for (int i = 0; i < input.length(); i++) {
               if (Character.isLetter(input.charAt(i))) {
                  count++;
               } 
               else if (input.charAt(i) == ' ') {
                  if (count > maxLength) {
                     maxLength = count;
                     longestWord = input.substring(start, i);
                    }
                count = 0;
                start = i + 1;
                }
            }

             if (count > maxLength) {
    maxLength = count;
    longestWord = input.substring(start, input.length());
}

             System.out.println("Longest word: " + longestWord);
             System.out.println("Length : " + maxLength );
        }
        sc.close();
    }
}

/*Time → O(n)
Auxilary Space : O(1) */