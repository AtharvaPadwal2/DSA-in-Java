package SearchingandSorting;
import java.util.*;

public class LinearSearch{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        System.out.print("Enter target number to be found : ");
        int target = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] arr = new int[size];
             for (int index = 0; index < arr.length; index++) {
                System.out.print("Enter element " + (index + 1) + ": ");
                arr[index] = sc.nextInt();
            }

            boolean found = false;

for(int index = 0; index < arr.length; index++) {
    if(arr[index] == target) {
        System.out.println("Target found at index : " + index);
        found = true;
        break;
    }
}

if(!found) {
    System.out.println(-1);
}

        }

        sc.close();
    }
}

// Time Complexity:
// Best Case    : O(1) - Target is at the first index.
// Average Case : O(n) - Target may be somewhere in the array.
// Worst Case   : O(n) - Target is at the last index or not present.

// Space Complexity:
// O(1) - Linear Search uses only a constant amount of extra space.