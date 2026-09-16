package Strings;

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        if (name.isEmpty()) {

            System.out.println("Invalid Input");

        } else {

            int vowelCount = 0;
            int consonantCount = 0;
            int digitCount = 0;
            int spaceCount = 0;

            
            for (int index = 0; index < name.length(); index++) {

                char ch = Character.toLowerCase(name.charAt(index));

                
                if (Character.isLetter(ch)) {

                    
                    if (ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {

                        vowelCount++;

                    } else {

                        consonantCount++;
                    }

                }

                
                else if (Character.isDigit(ch)) {

                    digitCount++;

                }

                
                else if (Character.isWhitespace(ch)) {

                    spaceCount++;
                }
            }

            System.out.println("Vowels : " + vowelCount);
            System.out.println("Consonants : " + consonantCount);
            System.out.println("Digits : " + digitCount);
            System.out.println("Spaces : " + spaceCount);
        }

        sc.close();
    }
}