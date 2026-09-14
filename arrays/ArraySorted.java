import java.util.*;


public class ArraySorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size : ");
        int size = sc.nextInt();

        boolean isSorted = true;

        if(size<=0){
            System.out.println("Invalid Input");
        }
        else{
            int[] numbers = new int[size];

            for(int index = 0; index<numbers.length ;  index++){
                System.out.print("Enter Element "+(index+1)+ ":");
                numbers[index] = sc.nextInt();
            }


           

           for(int index = 0; index < numbers.length - 1; index++)
{
                if(numbers[index]>numbers[index+1]){
                    isSorted=false;
                    break;                    
                }
                

            }

            if(isSorted == true){
                System.out.println("Array is sorted"+ Arrays.toString(numbers));
            }
            else{
                System.out.println("Array is not sorted");
            }

            
        }
        sc.close();
    }
}

/*Checking sortedness:
Best Case  : O(1)
Worst Case : O(n)

Whole Program Time : O(n)
Total Space        : O(n)
Auxiliary Space    : O(1) */