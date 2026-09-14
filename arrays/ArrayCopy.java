import java.util.*;
public class ArrayCopy {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter size");
         int size = sc.nextInt();

         if(size<=0){
            System.out.println("Invalid input ");

         }

         else{
            int[] numbers = new int[size];
            for( int index =0; index<numbers.length ; index++){
                System.out.print("Enter Element "+(index+1)+" : ");
                numbers[index] = sc.nextInt();
             }

             int[] secondarray = new int[size];

             for(int index =0 ; index<numbers.length ; index++){
               secondarray[index] = numbers[index];
             }
             System.out.println("Original Array : "+ Arrays.toString(numbers));
             System.out.println("Copied Array : "+ Arrays.toString(secondarray));
             sc.close();
         }
    }
}
/*Input loop       → O(n)
Copy loop        → O(n)

Total Time       → O(n)

Two arrays       → O(n) + O(n)
Total Space      → O(n)

Auxiliary Space for copy itself → O(n) */