import java.util.*;
public class ArrayMinandMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];
            for(int index=0; index<numbers.length; index++){
                System.out.print("Enter ur array"+(index+1));
                numbers[index]=sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

              for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] > max) {
                    max = numbers[index];
                }
                if (numbers[index] < min) {
                    min = numbers[index];
                }

               
            
            }
             System.out.println("The Maximum number in the entered array is : "+ max);
                System.out.println("The Smallest number in the given array is : "+ min);
        }
        sc.close();
    }
}

/*
ArrayMinandMax.java

Time Complexity  : O(n)
Space Complexity : O(n)
*/