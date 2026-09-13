import java.util.*;
public class ArraySecondLargest {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int size = sc.nextInt();


        if(size<=0){
            System.out.println("Inavlid input");

        }
        else{
            int[] numbers = new int[size];

            for(int index=0; index<numbers.length; index++){
                System.out.print("Elements : "+(index+1));
                numbers[index]= sc.nextInt();
            }

            int max =Integer.MIN_VALUE;
            int secondmax =Integer.MIN_VALUE;

            for(int index = 0; index<numbers.length; index++){
               if (numbers[index] > max) {
               secondmax = max;       
               max = numbers[index];  
               } else if (numbers[index] < max && numbers[index] > secondmax) {
              secondmax = numbers[index]; 
               }

            }
            if (secondmax == Integer.MIN_VALUE) {
    System.out.println("No second largest distinct element");
} else {
    System.out.println("Second largest number : " + secondmax);
}
           
            sc.close();
    }
    
}
}

/*
ArraySecondLargest.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)
*/
