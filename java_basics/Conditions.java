import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int Number = sc.nextInt();

        if (Number>0){
            System.out.println("Number is Positive");
        }
        else if(Number<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is zero");
        }
         
        if(Number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

        if(Number%3==0 && Number%5==0){
            System.out.println("Number is divisible by 3 And 5");
        }
        else if (Number%3==0 || Number%5==0){
            System.out.println("Number is divisible by 3 Or 5");
        }
        else {
            System.out.println("Number is not divisible by 3 And 5");
        }
        sc.close();
    }
}