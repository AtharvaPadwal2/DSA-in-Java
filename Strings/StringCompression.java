package Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();

        name = name.toLowerCase();

        if (name.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            String result = "";
            int count = 1;

            // Loop through characters, stopping one before the end
            for (int index = 0; index < name.length() - 1; index++) {
                if (name.charAt(index) == name.charAt(index + 1)) {
                    count++;
                } else {
                    result += name.charAt(index) + String.valueOf(count);
                    count = 1;
                }
            }
            result += name.charAt(name.length() - 1) + String.valueOf(count);

            System.out.println("Compressed String: " + result);
        }

        sc.close();
    }
}


/*Traversal → O(n)
Result    → O(n) */