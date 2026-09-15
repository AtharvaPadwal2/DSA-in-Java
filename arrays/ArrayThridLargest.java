import java.util.*;
public class ArrayThridLargest {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int size = sc.nextInt();


        if(size<3){
            System.out.println("Inavlid input");

        }
        else{
            int[] numbers = new int[size];

            for(int index=0; index<numbers.length; index++){
                System.out.print("Elements : "+(index+1));
                numbers[index]= sc.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int secondmax = Integer.MIN_VALUE;
            int thirdmax = Integer.MIN_VALUE;

            for(int index=0 ; index<numbers.length; index++){

                if(numbers[index] > max){
                    thirdmax=secondmax;
                    secondmax=max;
                    max=numbers[index];
                }
                else if(numbers[index]<max && numbers[index]>secondmax){
                    thirdmax=secondmax;
                    secondmax=numbers[index];
                    
                }
                else if(numbers[index]<secondmax && numbers[index]>thirdmax){
                    thirdmax=numbers[index];
                }
            }
            System.out.println("The third largest number is : " +thirdmax);
        }
        sc.close();
    }
}