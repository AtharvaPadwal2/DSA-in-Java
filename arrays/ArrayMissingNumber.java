import java.util.*;
public class ArrayMissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter till where u want your Array : ");
        int n = sc.nextInt();

       int size = n-1;
        if(n<=1){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];
            
            long actualsum = 0;
            for (int index = 0; index < numbers.length; index++) {
                System.out.print("Enter element " + (index + 1) + ": ");
                numbers[index] = sc.nextInt();
                
                actualsum += numbers[index];
            }
            long expectedsum = n * (n+1)/2;

              long missing = expectedsum - actualsum;

              System.out.println("The missing number in the Array is : "+missing);
        }
         sc.close();
    }
   
}

/*
ArrayMissingNumber.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)

Technique: Mathematical Sum
*/