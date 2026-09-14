import java.util.*;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array 1 : ");
        int size = sc.nextInt();

        System.out.print("Enter Size of Array 2 : ");
        int size2 = sc.nextInt();

        if (size <= 0 || size2 <= 0) {
            System.out.println("Invalid Input");
        } else {
            int[] first = new int[size];
            int[] second = new int[size2];

            for (int index = 0; index < first.length; index++) {
                System.out.print("Enter Element " + (index + 1) + " for Array 1: ");
                first[index] = sc.nextInt();
            }

            
            for (int index = 0; index < second.length; index++) {
                System.out.print("Enter Element " + (index + 1) + " for Array 2: ");
                second[index] = sc.nextInt();
            }

            
            int[] arr = new int[size + size2];
            int k = 0;

            for (int i = 0; i < size; i++) {
                arr[k++] = first[i];
            }
            for (int i = 0; i < size2; i++) {
                arr[k++] = second[i];
            }

            System.out.println("The Merged Array is : " + Arrays.toString(arr));
        }

        sc.close();
    }
}

/*
ArrayMerge.java

Time Complexity      : O(n + m)
Total Space           : O(n + m)
Auxiliary Space       : O(n + m)

Technique: Multiple Array Traversal
*/