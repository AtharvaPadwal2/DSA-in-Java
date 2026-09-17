package Strings;

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String name = sc.nextLine();

        System.out.print("Enter 2nd String : ");
        String name2 = sc.nextLine();

        name = name.toLowerCase();
        name2 = name2.toLowerCase();

        int[] frequency = new int[26];
        if(name.length() != name2.length()){
            System.out.println("The String are not Anagram!!!!!!!");
        }
        else{
           for (int index = 0; index < name.length(); index++) {
             char ch = name.charAt(index);
             if(Character.isLetter(ch)){
             frequency[ch - 'a']++;
             }
            }

            for (int index = 0; index<name2.length(); index++){
                char ch = name2.charAt(index);
                if(Character.isLetter(ch)){
                frequency[ch - 'a']--;
                }
            }

             boolean isAnagram = true;
            for(int count : frequency) {
                if(count != 0) {
                    isAnagram = false;
                    break;
                }
            }


            if(isAnagram) {
                System.out.println("The Strings are Anagram");
            } else {
                System.out.println("The Strings are not Anagram!!!!!!!");
            }


                }
                sc.close();
            }
            
        }

        
 /*  Lowercase conversion     : O(n)
First String traversal   : O(n)
Second String traversal  : O(n)
Frequency array check    : O(26)

Total:
O(n + n + n + 26):  O(n)

Auxiliary Space:
int[26]: O(1)*/