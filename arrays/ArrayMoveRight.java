import java.util.*;
public class ArrayMoveRight {

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

            int temp = numbers[numbers.length-1];
              for(int index = numbers.length - 1; index > 0; index--){
                numbers[index] = numbers[index - 1];
            }
            numbers[0] = temp;
            System.out.println("The Updated Array is : " + Arrays.toString(numbers));
            }
             sc.close();
        }
       
    }


    /*
ArrayMoveRight.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)

Technique: Array Shifting
*/