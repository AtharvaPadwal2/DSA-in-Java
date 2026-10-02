package SearchingandSorting;

import java.util.Scanner;

public class SearchRotatedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the array : ");
        int size = sc.nextInt();

        System.out.print("Enter target to be found : ");
        int target = sc.nextInt();

        if (size <= 0 || size > 100000) {
            System.out.println("Invalid input");
        } else {
            int[] arr = new int[size];

            System.out.println("Enter elements in rotated sorted order:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int low = 0;
            int high = arr.length - 1;
            boolean found = false;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid] == target) {
                    System.out.println("Target found at index : " + mid);
                    found = true;
                    break;
                }

                if (arr[low] <= arr[mid]) {
                    if (target >= arr[low] && target < arr[mid]) {
                        high = mid - 1; // search left
                    } else {
                        low = mid + 1; // search right
                    }
                } else {
                    if (target > arr[mid] && target <= arr[high]) {
                        low = mid + 1; // search right
                    } else {
                        high = mid - 1; // search left
                    }
                }

            }
            if (!found) {
                System.out.println("Target not found in the array.");
            }
            sc.close();

        }
    }
}

// Time Complexity:
// Best Case : O(1) - Target is found at the middle index immediately.
// Average Case : O(log n) - Half of the search space is eliminated each time.
// Worst Case : O(log n) - Maximum number of binary search divisions required.

// Space Complexity:
// O(1) - Only a constant number of variables are used.