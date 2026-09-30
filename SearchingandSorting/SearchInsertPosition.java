package SearchingandSorting;

import java.util.Scanner;

public class SearchInsertPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        System.out.print("Enter target to be found : ");
        int target = sc.nextInt();

        if(size <= 0 || size > 100000){
            System.out.println("Invalid input");
        } 
        else {
            int[] arr = new int[size];
            for(int i = 0 ; i<arr.length; i++){
                System.out.print("Enter element at index "+ i + " : ");
                arr[i]= sc.nextInt();
            } 

            boolean found = false;
            int low = 0;
            int high = arr.length -1;

            while(low <= high){
                int mid = low + (high-low)/2;

                if(target == arr[mid]){
                    System.out.println("Tagret found at index " + mid);
                    found = true ;
                    break;
                }
                else if(target < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
              if(!found){
                System.out.println("Target not found. It should be inserted at index " + low);
            }

        }
        sc.close();
    }
    
}

// Time Complexity:
// Best Case    : O(1) - Target is found at the middle index immediately.
// Average Case : O(log n) - Search space is divided in half each iteration.
// Worst Case   : O(log n) - Target is absent or requires maximum divisions.

// Space Complexity:
// O(1) - Only a constant number of variables are used.