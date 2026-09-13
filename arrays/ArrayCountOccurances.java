import java.util.*;
public class ArrayCountOccurances {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size");
        int size = sc.nextInt();

        int count = 0;

        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];
            for(int index = 0;index<numbers.length;index++){
                System.out.print("Elements "+(index+1)+":");
                numbers[index]=sc.nextInt();
            }
            System.out.print("Enter target number to be found : ");
            int target = sc.nextInt();

          for(int index = 0; index < numbers.length; index++) {
          if(target == numbers[index]){
            count++;
          }
          
        }
         System.out.println("No of time target appeared in the array : "+count);
         if(count==0){
            System.out.println("Target not found in given array : ");
         }
        sc.close();
    }
}
}


/*
Time Complexity  : O(n)
Space Complexity : O(n)
*/

