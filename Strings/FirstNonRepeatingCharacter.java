package Strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        if(name.isEmpty()){
            System.out.println("Invalid Input");
        } else {
            name = name.toLowerCase();

            int[] frequency = new int[26];

            for(int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if(Character.isLetter(ch)) {
                    frequency[ch - 'a']++;
                }
            }

            boolean found = false;
            for(int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if(Character.isLetter(ch) && frequency[ch - 'a'] == 1) {
                    System.out.println("First Non-Repeating Character : " + ch);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("No non-repeating character found.");
            }
        }

        sc.close();
    }
}
