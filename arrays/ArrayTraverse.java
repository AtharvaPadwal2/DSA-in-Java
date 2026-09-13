import java.util.*;

public class ArrayTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
         
        if (size <= 0) {
            System.out.println("Invalid Input");
        } else {
            int[] numbers = new int[size];
            for (int index = 0; index < numbers.length; index++) {
                System.out.print("Enter element " + (index + 1) + ": ");
                numbers[index] = sc.nextInt();
            }

            for (int index = 0; index < numbers.length; index++) {
                System.out.println("Element " + (index + 1) + " : " + numbers[index]);
            }

            for(int index = numbers.length-1;index>=0;index--){
                System.out.println("Element"+(index+1)+":"+numbers[index]);
            }
        }
        sc.close();
    }
}

/* ArrayTraverse.java
   Time Complexity  : O(n)
   Space Complexity : O(n)
*/
