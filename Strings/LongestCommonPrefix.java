package Strings;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total number of strings: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        if (size <= 0) {
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a String: ");
            words[i] = sc.nextLine().toLowerCase(); 
            if (words[i].isEmpty()) {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
        }

        
        String prefix = words[0]; 
for (int i = 1; i < size; i++) {
    String current = words[i];
    int j = 0;
    while (j < prefix.length() && j < current.length() &&
           prefix.charAt(j) == current.charAt(j)) {
        j++;
    }
   
    prefix = prefix.substring(0, j);
    if (prefix.isEmpty()) {
        break;
    }
}


        if (prefix.isEmpty()) {
            System.out.println("No common prefix found.");
        } else {
            System.out.println("Longest Common Prefix: " + prefix);
        }

        sc.close();
    }
}

/*Time  → O(n × m)
Auxiliary Space → O(1) */