import java.util.Scanner;

public class MethodCalculator{

   
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract (int a , int b){
        return a - b;
    }
    public static int multiply (int a , int b){
        return a * b;
    }
    public static double divide (int a , int b){
        return (double) a / b;
    }
    public static int remainder (int a , int b){
        return a % b;
    }




   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();

         System.out.print("Enter Second number:");
        int b = sc.nextInt();

        System.out.println(" Choose operation:");

        System.out.println("1. +");

        System.out.println("2. x");

        System.out.println("3.  -");
        
        System.out.println("4.  /");

        System.out.println("5.  %");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The sum of two numbers is : "+(add(a, b)));
                 break;

            case 2:
                System.out.println("The product of two numbers is : "+ (multiply(a, b)));  
                break;   
             
             case 3:
                System.out.println("The Subtraction of two numbers is : "+ (subtract(a, b)));  
                break;      
            
           case 4:
                if (b == 0) {
                System.out.println("Cannot divide by zero");
                } else {
                double result = divide(a, b);
                System.out.println("Division result: " + result);
                }
                break;

               case 5:
               if (b == 0) {
               System.out.println("Cannot perform modulus by zero");
               } else {
               System.out.println("Modulus result: " + (remainder(a, b)));
                }
                 break;

               default:
               System.out.println("Invalid operation choice");
                break;
               }
        sc.close();
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)