package Strings;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();
        boolean[] seen = new boolean[26];

        if(name.isEmpty()){
            System.out.print("Invalid Input");
        }
        else{
          String result = "";
          for(int index = 0; index < name.length(); index++) {
          char ch = name.charAt(index);

          if(Character.isLetter(ch)) {
          int pos = Character.toLowerCase(ch) - 'a';
          if(!seen[pos]) {
            result += ch;
            seen[pos] = true;
        }
          } else {
             result += ch;
          }
}
System.out.println("Without Duplicates : " + result);

        }
        sc.close();
    }
}

/*Time Complexity : O(n)
Auxilary space : O(1) */