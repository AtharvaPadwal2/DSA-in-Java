package SearchingandSorting;

import java.util.Scanner;

public class LastOccurrence {
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
            int result = -1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(arr[mid] == target){
                    result = mid;
                    low = mid +1 ;
                } else if(arr[mid] < target){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
              if(result != -1){
                System.out.println("Last occurrence at index : " + result);
            } else {
                System.out.println("Target not found in the array.");
            }

        
        }

        sc.close();
    }
}

// Time Complexity:
// Best Case    : O(log n)
// Average Case : O(log n)
// Worst Case   : O(log n)
// Binary Search continues toward the right to find the last occurrence.

// Space Complexity:
// O(1) - Only a constant number of variables are used.