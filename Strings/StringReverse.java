package Strings;
import java.util.*;


public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        if(name.isEmpty()){
            System.out.println("Invalid input");
        }
        else{
          String reversed = "";

for (int index = name.length() - 1; index >= 0; index--) {
    reversed = reversed + name.charAt(index);
}

System.out.println("Reversed String : " + reversed);
           
        }

        sc.close();
    }
}
