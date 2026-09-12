import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();

         System.out.print("Enter Second number:");
        int num2 = sc.nextInt();

        System.out.println(" Choose operation:");

        System.out.println("1. +");

        System.out.println("2. x");

        System.out.println("3.  -");
        
        System.out.println("4.  /");

        System.out.println("5.  %");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The sum of two numbers is : "+(num1 + num2));
                 break;

            case 2:
                System.out.println("The product of two numbers is : "+ (num1 * num2));  
                break;   
             
             case 3:
                System.out.println("The Subtraction of two numbers is : "+ (num1 - num2));  
                break;      
            
           case 4:
    if (num2 == 0) {
        System.out.println("Cannot divide by zero");
    } else {
        double result = (double) num1 / num2;
        System.out.println("Division result: " + result);
    }
    break;

case 5:
    if (num2 == 0) {
        System.out.println("Cannot perform modulus by zero");
    } else {
        System.out.println("Modulus result: " + (num1 % num2));
    }
    break;

default:
    System.out.println("Invalid operation choice");
                break;
        }
        sc.close();
    }
}
