import java.util.*;
public class ArrayEvenandOddCount {

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

            int evenCount = 0;
            int oddCount = 0;

            for(int index =0 ; index<numbers.length; index++){
                if(numbers[index] %2 ==0){
                    evenCount ++ ;
                }
                else{
                    oddCount++;
                }
            }
            System.out.println("the total number of even numbers = "+ evenCount);
            System.out.println("the total number of odd numbers = "+ oddCount);
        }
        sc.close();
    }
}

/*
ArrayEvenandOddCount.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)
*/