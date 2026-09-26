package Strings;
import java.util.*;
public class FirstUniqueCharacter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        if(input.isEmpty()){
            System.out.println("Invalid Input");

        }
        else{
            input = input.toLowerCase();

            int[] frequency = new int[26];
             for(int i = 0; i <input.length(); i++) {
                char ch = input.charAt(i);
                if(Character.isLetter(ch)) {
                    frequency[ch - 'a']++;
                }
            }
           int uniqueIndex = -1;

for (int i = 0; i < input.length(); i++) {

    char ch = input.charAt(i);

    if (frequency[ch - 'a'] == 1) {
        uniqueIndex = i;
        break;
    }
}

if (uniqueIndex == -1) {

    System.out.println("No Unique Characters found in the given String");

} else {

    System.out.println(
        "The First Unique Character is : " + input.charAt(uniqueIndex)
    );

    System.out.println(
        "The Unique Character was found at index : " + uniqueIndex
    );
}

        }
        sc.close();
    }

}
