import java.util.*;
public class ArrayMoveZeros {

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

            
            int pos=0;

            for(int index = 0; index<=numbers.length-1 ; index++){
               
                if(numbers[index] != 0){
                    numbers[pos] = numbers[index];
                    pos++;
               
                }
            }

             while(pos<numbers.length){
                    numbers[pos]=0;
                    pos++;
                }
            System.out.println("The array is " +Arrays.toString(numbers));
        }
        sc.close();
    }
}


/*
ArrayMoveZeros.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)

Technique: In-place modification
*/