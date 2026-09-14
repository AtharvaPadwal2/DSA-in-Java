import java.util.*;

public class ArrayDuplicates {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = sc.nextInt();


        boolean hasDuplicate = false;
        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];
            for(int index = 0; index<numbers.length ; index++){
                System.out.println("Enter element:  "+(index+1)+ " ");
                numbers[index] = sc.nextInt();

                
               

            }
            for(int i = 0; i < numbers.length; i++) {
    for(int j = i+1; j < numbers.length; j++) {
        if(numbers[i] == numbers[j]) {
            hasDuplicate = true;
            break;
        }
    }
}

                
               if(hasDuplicate) {
    System.out.println("Duplicate found!");
} else {
    System.out.println("No duplicates found.");
}
 
sc.close();
        }
    }
}


/*
ArrayDuplicates.java

Brute Force Approach

Best Case          : O(1)
Worst Case         : O(n²)

Whole Program Time : O(n²)
Total Space        : O(n)
Auxiliary Space    : O(1)
*/