import java.util.*;
public class ArrayFirstLastOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();

       
        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];

            for( int index=0 ; index<numbers.length; index++){

            System.out.print("Enter Element :" + (index+1)+ " ");

            numbers[index] = sc.nextInt();
            }
             System.out.print("Set Target Number : ");
        int target = sc.nextInt();
        int first = -1;
        int last = -1;

        for(int index = 0; index<numbers.length;index++){
           if(numbers[index] == target) {
    if(first == -1) {
        first = index;   
    }
    last = index;        
}


        }
        System.out.println("the first occurrence of target is at : "+ first + " Last occurrence of target is at : "+ last);

        }
        sc.close();
    }

}


/*
ArrayFirstLastOccurrence.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)
*/