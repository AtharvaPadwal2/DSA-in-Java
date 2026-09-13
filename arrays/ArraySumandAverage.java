import java.util.*;

public class ArraySumandAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid Input");
        } else {
            int[] numbers = new int[size];
            int sum = 0;

         for (int index = 0; index < numbers.length; index++) {
                System.out.print("Enter element " + (index + 1) + ": ");
                numbers[index] = sc.nextInt();
                sum += numbers[index]; 
            }

            double average = (double)sum/size;

            System.out.println("The sum of the array is : "+ sum);
            System.out.println("The average of the array is : "+ average);

       
           
        
        sc.close();
    }
}
}

/*
ArraySumandAverage.java

Time Complexity  : O(n)
Space Complexity : O(n)
*/