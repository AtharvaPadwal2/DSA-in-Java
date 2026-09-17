package Strings;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        if(name.isEmpty()){
            System.out.println("Invalid Input");
        } else {
            name = name.toLowerCase();

            int[] frequency = new int[26];

            for(int index = 0; index < name.length(); index++) {
                char ch = name.charAt(index);

                // Only process letters
                if(Character.isLetter(ch)) {
                    frequency[ch - 'a']++;
                }
            }

            System.out.println("Character frequencies:");
            for(int i = 0; i < 26; i++) {
                if(frequency[i] > 0) {
                    char letter = (char) ('a' + i);
                    System.out.println(letter + " : " + frequency[i]);
                }
            }
        }

        sc.close();
    }
    
}

/*Time complexity : O(n) + O(26)
= O(n) + O(1)
= O(n)

Space complexity : O(1)*/