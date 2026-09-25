package Strings;
import java.util.*;
public class FirstLastOccurrenceString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String input = sc.nextLine();

        System.out.print("Enter a target");
        char target = sc.next().charAt(0);

        if(input.isEmpty()){
            System.out.println("Invalid Input");
        }
        else{
            input = input.toLowerCase();
           

           int first = -1;
           int last = -1;

        for(int i = 0; i < input.length(); i++) {
              if(input.charAt(i) == target) {
             if(first == -1) {
                first = i;   
        }
        last = i;        
    }
}

if(first == -1) {
    System.out.println("Target not found");
} else {
    System.out.println("First occurrence of '" + target + "' at index: " + first);
    System.out.println("Last occurrence of '" + target + "' at index: " + last);
}

        sc.close();
    }
}
    }


