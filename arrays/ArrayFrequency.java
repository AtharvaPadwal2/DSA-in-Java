import java.util.*;
public class ArrayFrequency {

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

            
          for(int i = 0; i < numbers.length; i++) {
                boolean alreadyCounted = false;
                for(int k = 0; k < i; k++) {
                    if(numbers[k] == numbers[i]) {
                        alreadyCounted = true;
                        break;
                    }
                }

                if(alreadyCounted) continue; 
                int count = 1;
                for(int j = i+1; j < numbers.length; j++) {
                    if(numbers[j] == numbers[i]) {
                        count++;
                    }
                }

                System.out.println(numbers[i] + " occurs " + count + " times");
            }
        }
        sc.close();
    }
}

/*Time Complexity      : O(n²)
Total Space          : O(n)
Auxiliary Space      : O(1) */