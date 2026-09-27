package Strings;
import java.util.*;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        input = input.toLowerCase(); // case-insensitive

        boolean[] seen = new boolean[26]; // track characters in window
        int left = 0;                     // window start
        int maxLength = 0;                // longest substring length

        // move right pointer through the string
        for (int right = 0; right < input.length(); right++) {
            char ch = input.charAt(right);
            int pos = ch - 'a';

            // shrink window until duplicate disappears
            while (seen[pos]) {
                seen[input.charAt(left) - 'a'] = false;
                left++;
            }

            // mark current character as seen
            seen[pos] = true;

            // calculate current window length
            int currentLength = right - left + 1;

            // update maximum length
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println("Longest Substring Without Repeating Characters : " + maxLength);
        sc.close();
    }
}
