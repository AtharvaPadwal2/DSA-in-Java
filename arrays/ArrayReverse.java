import java.util.*;
public class ArrayReverse {

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


            int left = 0;
            int right = numbers.length - 1;



while(left < right){
    int temp = numbers[left];
numbers[left] = numbers[right];
numbers[right] = temp;

    left++;
    right--;
}
System.out.println("Reversed array is : " + Arrays.toString(numbers));



        }
        sc.close();
    }
}


/*
ArrayReverse.java

Time Complexity      : O(n)
Total Space           : O(n)
Auxiliary Space       : O(1)

Technique: Two Pointers
*/