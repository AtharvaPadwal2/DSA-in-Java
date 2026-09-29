package SearchingandSorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size : ");
        int size = sc.nextInt();

        System.out.print("Enter Target to be found : ");
        int target = sc.nextInt();

        if(size <= 0 || size > 100000){
            System.out.println("Invalid input");
        } else {
            int[] arr = new int[size];

            System.out.println("Enter elements in sorted order:");
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int low = 0;
            int high = arr.length - 1;
            boolean found = false;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(arr[mid] == target){
                    System.out.println("Target found at index : " + mid);
                    found = true;
                    break;
                } else if(arr[mid] < target){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if(!found){
                System.out.println("Target not found in the array.");
            }
        }

        sc.close();
    }
}
// Time Complexity:
// Best Case    : O(1) - Target is found at the middle index immediately.
// Average Case : O(log n) - Search space is divided into half each time.
// Worst Case   : O(log n) - Target requires maximum divisions or is not present.

// Space Complexity:
// O(1) - Iterative Binary Search uses only a constant amount of extra space.
