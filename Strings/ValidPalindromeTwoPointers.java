package Strings;

import java.util.*;

public class ValidPalindromeTwoPointers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to check if palindrome : ");
        String palindrome = sc.nextLine();

        if(palindrome.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            int left = 0;
            int right = palindrome.length()-1;
            boolean ispalindrome =true;
            palindrome = palindrome.toLowerCase();

            while (left < right) {
                if (Character.isWhitespace(palindrome.charAt(left))) {
    left++;
    continue;
}

if (Character.isWhitespace(palindrome.charAt(right))) {
    right--;
    continue;
}
                if(palindrome.charAt(left) == palindrome.charAt(right) ){
                    left++;
                    right--;
                }
                else{
                    ispalindrome=false;
                    break;
                }
            }
            if (ispalindrome) {
    System.out.println("The entered string IS a palindrome");
} else {
    System.out.println("The entered string is NOT a palindrome");
}

        }
        sc.close();
    }
}

/*Time  → O(n)
Extra space → O(1)  */