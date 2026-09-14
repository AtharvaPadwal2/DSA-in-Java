import java.util.*;


public class ArrayRemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = sc.nextInt();

        

        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];

            for(int index = 0; index<numbers.length ;  index++){
                System.out.print("Enter Element "+(index+1)+ ":");
                numbers[index] = sc.nextInt();
            }

            int left = 0;

            for(int index =0 ; index<numbers.length;index++){
                if(numbers[index] != numbers[left]){
                    left ++;
                    numbers[left] = numbers[index];
                    
                }
            }
            System.out.print("The unique elements in array are: ");
            for (int i = 0; i <= left; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println("\nThe number of unique elements is: " + (left + 1));
        
        }
        sc.close();
    }
}

/*
Time Complexity      : O(n)
Total Space          : O(n)
Auxiliary Space      : O(1)

Technique: Two Pointers
*/