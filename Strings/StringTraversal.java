package Strings;
import java.util.*;


public class StringTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = sc.nextLine();

        if(name.isEmpty()){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Forward");
            for(int index = 0; index<name.length(); index++){
                
                System.out.println("index " +index +": "+ name.charAt(index));
            }
            System.out.println("Backward");
            for (int index = name.length()-1; index >= 0 ; index--){
                
                System.out.println("index " +index +": "+ name.charAt(index));
            }
        }

        sc.close();
    }
}
