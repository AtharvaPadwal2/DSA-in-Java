import java.util.*;
public class ArrayLinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size");
        int size = sc.nextInt();
boolean found = false;
        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];
            for(int index = 0;index<numbers.length;index++){
                System.out.print("Elements "+(index+1)+":");
                numbers[index]=sc.nextInt();
            }
            System.out.print("Enter target number to be found : ");
            int target = sc.nextInt();

          for(int index = 0; index < numbers.length; index++) {
    if(target == numbers[index]) {
        System.out.println("The target is found at index : " + index);
        found = true;
        break;
    }
    
}
if (!found) {
    System.out.println("Target not found in given array");
}
        sc.close();
    }
}
}

/*
ArrayLinearSearch.java

Linear Search:
Best Case    : O(1)
Average Case : O(n)
Worst Case   : O(n)

Whole Program Time : O(n)
Space Complexity   : O(n)
*/

/* with break; for first appearance

without break; for multiple appearance throughout the array*/