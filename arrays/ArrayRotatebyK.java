import java.util.*;
public class ArrayRotatebyK {

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


            System.out.print("Enter k (positions to rotate): ");
            int k = sc.nextInt();

            if(k<0){
                System.out.println("Invalid input");
            }
            else{
                 k = k % size; // important trick: normalize k

                // Step 1: reverse entire array
                reverse(numbers, 0, size - 1);

                // Step 2: reverse first k elements
                reverse(numbers, 0, k - 1);

                // Step 3: reverse remaining elements
                reverse(numbers, k, size - 1);

                System.out.println("Array after rotating right by " + k + " positions: " + Arrays.toString(numbers));
            }
        }
        sc.close();
    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
